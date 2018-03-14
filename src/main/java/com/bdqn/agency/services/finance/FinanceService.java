package com.bdqn.agency.services.finance;

import com.bdqn.agency.entity.Finance;
import com.bdqn.agency.entity.Type;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * Created by Administrator on 2018/3/13/013.
 */
public interface FinanceService {
    //查看全部Finance
    PageInfo<Finance> queryAll(int pageNum,int pageSize);
    public int addFinance(Finance finance);
    public List<Type> queryAllType();
    public int updateFinance(Finance finance);
}
