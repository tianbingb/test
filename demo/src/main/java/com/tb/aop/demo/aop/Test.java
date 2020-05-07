package com.tb.aop.demo.aop;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;



/**
 * @author tb
 */
@RestController
@RequestMapping("/Test")
@Transactional(rollbackFor = Exception.class)
public class Test {

    @MyLog(desc = "测试aop")
    @GetMapping(value = "/aopTest")
    public void Test(String a,String b){

        System.out.println("啦啦啦");
    }








}
