package com.bdqn.agency.services.finance;

import com.bdqn.agency.entity.Finance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/3/13/013.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class FinanceServiceImplTest {
    @Resource
    private FinanceService financeService;
    @Test
    public void addFinance() throws Exception {
        Finance finance = new Finance();
        finance.setBalance(1200);
        finance.setMoney(12222);
        finance.setRemark("今天天气不错呀");
        finance.setTypeid(3);
        int n = financeService.addFinance(finance);
        System.out.println(n);
    }

}