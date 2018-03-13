package com.bdqn.agency.services;

import com.bdqn.agency.entity.Finance;
import com.github.pagehelper.PageInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/3/13/013.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})

public class FinanceServiceImplTest {
    @Resource
    private FinanceService financeService;

    @Test
    public void queryAll() throws Exception {
        PageInfo<Finance> pageInfo = financeService.queryAll(1, 3);
        List<Finance> list = pageInfo.getList();
        if (list != null) {
            for (Finance finance : list) {
                System.out.println(finance);
            }
        }
    }

}