package com.dukz;

import static org.junit.Assert.assertTrue;

import com.dukz.aspect.HelloCounter;
import com.dukz.config.AppConfig;
import com.dukz.controller.HelloWorld;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Unit test for simple App.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppTest {

    @Autowired
    private HelloWorld helloWorld;

    @Autowired
    private HelloCounter helloCounter;

    @Test
    public void testHelloCounter(){
        helloWorld.sayHello();
        helloWorld.sayHello();
        helloWorld.sayHello();

        helloCounter.showCount();
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
