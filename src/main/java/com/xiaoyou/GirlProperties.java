package com.xiaoyou;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by xiaoyou.wyz on 2017/8/1.
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    private  int age;
    private String cupSize;

    public int getAge() {
        return age;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }
}
