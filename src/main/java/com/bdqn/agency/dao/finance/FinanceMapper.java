package com.bdqn.agency.dao.finance;

import com.bdqn.agency.entity.Finance;
import com.bdqn.agency.entity.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/3/13/013.
 */
public interface FinanceMapper {
    //查看全部Finance
    List<Finance> queryAll();

    //添加
    public int addFinance(Finance finance);

    //查询类型
    public List<Type> queryAllType();
    //修改,时间为当前时间,其他都修改
    public int updateFinance(Finance finance);
    //通过id查看Finance
    public Finance queryFinanceById(int id);

    //删除一条信息
    public int deleteFinanceById(int id);

    //删除多条信息
    public Integer deleteFinanceByIds(List<Integer> ids);

    //查询两个时间段之间的类型
    public List<Finance> queryCreatedateAndToCreatedate(@Param("createDateNo1") String  createDateNo1,@Param("createDateNo2") String createDateNo2,@Param("typeid")Integer typeid);
}
