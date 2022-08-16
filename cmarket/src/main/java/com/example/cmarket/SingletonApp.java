package com.example.cmarket;

import com.example.cmarket.singleton.SingletonService;
import com.example.cmarket.user.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SingletonApp {

    static AppConfig appConfig = new AppConfig();
    static AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

    //서로 다른 주소값을 가진다
    static UserService userService3 = appConfig.userService();
    static UserService userService4 = appConfig.userService();

    //싱글톤을 적용하여 서로 같은 주소값을 가진다
    static SingletonService singletonService1 = SingletonService.getInstance();
    static SingletonService singletonService2 = SingletonService.getInstance();

    //스프링 컨테이너 적용
    static UserService userService1 = ac.getBean("userService", UserService.class);
    static UserService userService2 = ac.getBean("userService", UserService.class);

    public static void main(String[] args) {
        System.out.println("userService3 = " + userService3);
        System.out.println("userService4 = " + userService4);

        System.out.println("singletonService1 = " + singletonService1);
        System.out.println("singletonService2 = " + singletonService2);

        System.out.println("userService1 = " + userService1);
        System.out.println("userService2 = " + userService2);
    }
}
