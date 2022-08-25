package com;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class CoffeePatchDto {
    private long coffeeId;

    @NotBlank(message = "공백을 입력할 수 없습니다.")
    private String korName;

    @NotBlank(message = "커피명은 공백이 아니어야 합니다.")
    @Pattern(regexp = "^[a-zA-Z](\\s?[a-zA-Z])*$",
            message = "영어만 입력 가능하며, 연속된 공백을 허용하지 않습니다.")
    private String engName;

    @Range(min = 100, max = 50000)
    private int price;

    public long getCoffeeId() {
        return coffeeId;
    }

    public void setCoffeeId(long coffeeId) {
        this.coffeeId = coffeeId;
    }

    public String getKorName() {
        return korName;
    }

    public void setKorName(String korName) {
        this.korName = korName;
    }

    public String getEngName() {
        return engName;
    }

    public void setEngName(String engName) {
        this.engName = engName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
