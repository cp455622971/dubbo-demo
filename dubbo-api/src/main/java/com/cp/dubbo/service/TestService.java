package com.cp.dubbo.service;

import com.cp.dubbo.entity.ResultVo;
import org.springframework.stereotype.Service;

/**
 * @className: TestService
 * @description: TODO 类描述
 * @author: cp
 * @date: 2021-08-19
 **/
@Service
public interface TestService {

    ResultVo doSomething(String str);
}
