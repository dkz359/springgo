package com.dukz;

import com.dukz.controller.HelloWorld;
import com.dukz.pojo.Instrumentalist;
import com.dukz.pojo.Juggler;
import com.dukz.pojo.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        // 1.创建spring ioc容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("app-context.xml");
        // 2.从ioc容器中获取bean实例
//        HelloWorld helloWorld = (HelloWorld) ioc.getBean("helloWorld");
//        helloWorld.sayHello();

//        Juggler ju = (Juggler) ioc.getBean("poeticDuke");
//        ju.perform();

//        Stage stage = (Stage) ioc.getBean("stage");
////        stage.createStage();

        Instrumentalist kenny = (Instrumentalist) ioc.getBean("kenny");
        kenny.perform();


        // 关闭容器
        ((ClassPathXmlApplicationContext)ioc).close();
    }
}
