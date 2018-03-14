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
    //添加,时间为当前时间
    public int addFinance(Finance finance);
    //获取类型菜单
    public List<Type> queryAllType();
    //修改,时间为当前时间,其他都修改
    public int updateFinance(Finance finance);
    //通过id查看Finance
    public Finance queryFinanceById(int id);
}
