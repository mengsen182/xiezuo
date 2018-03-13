package com.bdqn.agency.controller.finance;

import com.alibaba.fastjson.JSON;
import com.bdqn.agency.entity.Finance;
import com.bdqn.agency.services.finance.FinanceService;
import com.bdqn.agency.util.PageUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
    @RequestMapping("toFinance")
    public String toFinance() {
        return "finance/finance";
    }
    @ResponseBody
    @RequestMapping(value = "queryFinance", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public String queryAll(Integer page, Integer rows) {
        PageInfo<Finance> pageInfo = financeService.queryAll(page, rows);
        PageUtil<Finance> pageUtil = new PageUtil<>(pageInfo);
        return JSON.toJSONString(pageUtil);
    }
}
