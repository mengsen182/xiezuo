package com.bdqn.agency.controller.finance;

import com.alibaba.fastjson.JSON;
import com.bdqn.agency.entity.Finance;
import com.bdqn.agency.services.finance.FinanceService;
import com.bdqn.agency.util.Message;
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
    //添加一条信息,时间为当前时间
    @ResponseBody
    @RequestMapping(value = "addFinance", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public String addFinance(Finance finance) {
        int n = financeService.addFinance(finance);
        if (n > 0) {
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }
    //查询所有类型
    @ResponseBody
    @RequestMapping(value = "queryAllType", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public String queryAllType() {
        return JSON.toJSONString(financeService.queryAllType());
    }
    //修改,时间为当前时间,其他都修改
    @ResponseBody
    @RequestMapping(value = "updateFinance", method = RequestMethod.POST, produces = {"application/json;charset=utf-8"})
    public String updateFinance(Finance finance) {
        int n = financeService.updateFinance(finance);
        if (n > 0) {
            return JSON.toJSONString(Message.success());
        }
        return JSON.toJSONString(Message.error());
    }
    //通过Id查询一条信息
    @ResponseBody
    @RequestMapping(value = "queryFinanceById", method = RequestMethod.GET, produces = {"application/json;charset=utf-8"})
    public String queryFinanceById(Integer id) {
        Finance finance = financeService.queryFinanceById(id);
        return JSON.toJSONString(finance);
    }
}
