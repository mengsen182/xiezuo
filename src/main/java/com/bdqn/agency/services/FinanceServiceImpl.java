package com.bdqn.agency.services;

import com.bdqn.agency.dao.FinanceMapper;
import com.bdqn.agency.entity.Finance;
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
    @Resource
    private FinanceMapper financeMapper;
    @Override
    public PageInfo<Finance> queryAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Finance> list = financeMapper.queryAll();
        PageInfo<Finance> pageInfo = new PageInfo<>(list);
        return pageInfo;
    }
}
