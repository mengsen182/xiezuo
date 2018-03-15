package com.bdqn.agency.services.finance;

import com.bdqn.agency.dao.finance.FinanceMapper;
import com.bdqn.agency.entity.Finance;
import com.bdqn.agency.entity.Type;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
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
    //修改,时间为当前时间,其他都修改
    @Override
    public int updateFinance(Finance finance) {
        return financeMapper.updateFinance(finance);
    }
    //通过id查看Finance
    @Override
    public Finance queryFinanceById(int id) {
        return financeMapper.queryFinanceById(id);
    }

    @Override
    public int deleteFinanceById(int id) {
        return financeMapper.deleteFinanceById(id);
    }

    @Override
    public Integer deleteFinanceByIds(List<Integer> ids) {
        return financeMapper.deleteFinanceByIds(ids);
    }

    @Override
    public List<Finance> queryCreatedateAndToCreatedate(String  createDateNo1, String  createDateNo2,Integer typeid) {
        return financeMapper.queryCreatedateAndToCreatedate(createDateNo1,createDateNo2,typeid);
    }
}
