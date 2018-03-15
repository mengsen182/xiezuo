package com.bdqn.agency.services.finance;

import com.bdqn.agency.entity.Finance;
import com.bdqn.agency.entity.Type;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/3/13/013.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class FinanceServiceImplTest {
    @Test
    public void queryCreatedateAndToCreatedate() throws Exception {


        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

         String N3 = dateFormat.format(new Date(2018,03,13,00,00,00));
        String N4 = dateFormat.format(new Date(2018,03,14,00,00,00));
        List<Finance> list = financeService.queryCreatedateAndToCreatedate(N3, N4);
        for (Finance finance : list) {
            System.out.println(finance);
        }
    }

    @Test
    public void deleteFinanceByIds() throws Exception {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        int n = financeService.deleteFinanceByIds(list);
        System.out.println(n);
    }

    @Test
    public void deleteFinanceById() throws Exception {
        int n = financeService.deleteFinanceById(21);
        if (n > 0) {
            System.out.println(n);
        }
    }

    @Test
    public void queryFinanceById() throws Exception {
        Finance finance = financeService.queryFinanceById(21);
        System.out.println(finance);
    }

    @Test
    public void updateFinance() throws Exception {
        Finance finance = new Finance();
        finance.setTypeid(3);
        finance.setRemark("今天天气为0");
        finance.setMoney(111);
        finance.setBalance(323);
        finance.setId(24);
        int n = financeService.updateFinance(finance);
        System.out.println(n);
    }

    @Test
    public void queryAllType() throws Exception {
        List<Type> list = financeService.queryAllType();
        for (Type type : list) {
            System.out.println(type);
        }
    }

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