package com.bdqn.agency.controller;

import com.bdqn.agency.services.FinanceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/3/13/013.
 */
@Controller
@RequestMapping("finance")
public class FinanceController {
    @Resource
    private FinanceService financeService;

    //跳转finance list页面
    @RequestMapping(value = "ToFinance", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public String queryAll(Integer page, Integer rows, Model model) {
       /* PageInfo<Finance> pageInfo = financeService.queryAll(page, rows);
        model.addAttribute("pageInfo", pageInfo);*/
        return "finance/finance";
    }
}
