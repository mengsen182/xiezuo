package com.bdqn.agency.dao;

import com.bdqn.agency.entity.Finance;

import java.util.List;

/**
 * Created by Administrator on 2018/3/13/013.
 */
public interface FinanceMapper {
    //查看全部Finance
    List<Finance> queryAll();
}
