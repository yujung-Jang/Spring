package com.example.cmarket;

import com.example.cmarket.discount.CurrentDiscountInfo;
import com.example.cmarket.discount.RateDiscountInfo;
import com.example.cmarket.order.Order;
import com.example.cmarket.order.OrderService;
import com.example.cmarket.user.User;
import com.example.cmarket.user.UserGrade;
import com.example.cmarket.user.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {
    public static void main(String[] args) {

//        AppConfig appConfig = new AppConfig();
//        UserService userService = appConfig.userService();
//        OrderService orderService = appConfig.orderService();

        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        UserService userService = ac.getBean(UserService.class);
        OrderService orderService = ac.getBean(OrderService.class);

        Long userId = 0L;
        User user = new User(userId, "jangyujung", UserGrade.GRADE_1);
        userService.signup(user);

        Order order = orderService.createOrder(userId, "coffee", 5000);

        System.out.println("order = " + order);

/*
        RateDiscountInfo discountInfo = new RateDiscountInfo();

        User user = new User(0L, "jangyujung", UserGrade.GRADE_1);
        int discountedPrice = discountInfo.discount(user, 5000);

        if (discountedPrice == 500) {
            System.out.println("회원 등급에 알맞은 할인이 적용되었습니다.");
            System.out.println("1등급 회원으로 5000 -> " + discountedPrice);
        }

        user = new User(0L, "janghyojung", UserGrade.GRADE_2);
        discountedPrice = discountInfo.discount(user, 5000);

        if (discountedPrice == 1000) {
            System.out.println("회원 등급에 알맞은 할인이 적용되었습니다.");
            System.out.println("2등급 회원으로 5000 -> " + discountedPrice);
        }
*/
    }
}
