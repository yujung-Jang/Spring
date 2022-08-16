package com.example.cmarket.singleton;

public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    //생성자를 private로 설정해서 외부에서 new 키워들 ㄹ사용한 객체 생성을 제한한다
    private SingletonService() {
    }

    public void logic() {
        System.out.println("싱글톤 객체를 호출합니다.");
    }
}
