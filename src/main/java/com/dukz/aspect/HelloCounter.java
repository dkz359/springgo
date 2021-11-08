package com.dukz.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * helloword访问计数器
 *
 * @ClassName HelloCounter
 * @Author dukz
 * @Date 2021/11/8
 * @Version 1.0
 */
@Aspect
public class HelloCounter {

    private int count = 0;

    @Pointcut("execution(* com.dukz.controller.HelloWorld.sayHello())")
    public void helloPC(){}

    @Before("helloPC()")
    public void counter(){
        count++;
    }

    public void showCount(){
        System.out.println("调用次数："+count);
    }
}
