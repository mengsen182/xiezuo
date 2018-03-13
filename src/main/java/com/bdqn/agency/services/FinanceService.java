package com.bdqn.agency.services;

import com.bdqn.agency.entity.Finance;
import com.github.pagehelper.PageInfo;

/**
 * Created by Administrator on 2018/3/13/013.
 */
public interface FinanceService {
    PageInfo<Finance> queryAll(int pageNum,int pageSize);
}
