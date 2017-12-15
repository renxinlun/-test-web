package com.renxinlun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 开发人:renxinlun
 * <p>
 * 功能描述:
 * <p>
 * 创建日期:16/7/26.
 */

@Service
public class TestService {

    @Autowired
    TestBean testBean;

    @Autowired
    Person person;

    public void SysTestService(){
       System.out.println(testBean.toString());
    }
}
