package com.kitchen.cook;

import com.kitchen.cook.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class ProxyTest {

    @Inject
    private IUserService userService;

    @Test
    public void testProxy() {
        String str = userService.getMessage();
        System.out.println("str: " + str);
    }
}
