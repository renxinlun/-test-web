package com.renxinlun.controller;

import com.renxinlun.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 开发人:renxinlun
 * <p>
 * 功能描述:
 * <p>
 * 创建日期:16/7/26.
 */
@Controller
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    TestService testService;

    @RequestMapping(value = "/toIndex", method = RequestMethod.GET)
    public String getIndex() {
        testService.SysTestService();
        return "index";
    }
}
