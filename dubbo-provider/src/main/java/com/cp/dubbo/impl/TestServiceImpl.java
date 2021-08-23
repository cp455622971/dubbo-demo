package com.cp.dubbo.impl;

import com.cp.dubbo.entity.ResultVo;
import com.cp.dubbo.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @className: TestServiceImpl
 * @description: TODO 类描述
 * @author: cp
 * @date: 2021-08-19
 **/
public class TestServiceImpl implements TestService {
    private Logger log = LoggerFactory.getLogger(TestServiceImpl.class);
    @Override
    public ResultVo doSomething(String str) {
        ResultVo rv = new ResultVo();
        rv.setName(str);
        rv.setText("good");
        log.info("good"+str);
        return rv;
    }
}
