package com.tb.aop.demo.aop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述 测试
 * @Author: tb
 * @param
 * @Date: 2020-05-06
 * @return
 */
@RestController
public class Test {



    @MyLog(desc = "测试aop")
    @GetMapping(value = "/test")
    private void Test(){

        System.out.println("啦啦啦");
    }
}
