package com.example.cmarket;

import com.example.cmarket.user.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoAppConfigTest {
    public static void main(String[] args) {

        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);

        UserService userService = ac.getBean(UserService.class);

        System.out.println(UserService.class.isInstance(userService));
    }
}
