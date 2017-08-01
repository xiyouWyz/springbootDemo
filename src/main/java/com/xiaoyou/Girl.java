package com.xiaoyou;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by xiaoyou.wyz on 2017/8/1.
 */
//表示这个类对应数据库中的一个表
//jpa的特性
@Entity
public class Girl {
    @Id
    @GeneratedValue
    private int id;
    private String cupSize;
    private int age;
    public  Girl(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
