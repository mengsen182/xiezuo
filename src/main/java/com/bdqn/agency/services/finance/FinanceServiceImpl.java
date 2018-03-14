package com.bdqn.agency.services.finance;

import com.bdqn.agency.dao.finance.FinanceMapper;
import com.bdqn.agency.entity.Finance;
import com.bdqn.agency.entity.Type;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/13/013.
 */
@Service
public class FinanceServiceImpl implements FinanceService {
    //mapper 注入
    @Resource
    private FinanceMapper financeMapper;
    //查看全部Finance
    @Override
    public PageInfo<Finance> queryAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Finance> list = financeMapper.queryAll();
        PageInfo<Finance> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public int addFinance(Finance finance) {
        return financeMapper.addFinance(finance);
    }

    @Override
    public List<Type> queryAllType() {

        return financeMapper.queryAllType();
    }

    @Override
    public int updateFinance(Finance finance) {
        return financeMapper.updateFinance(finance);
    }
}
