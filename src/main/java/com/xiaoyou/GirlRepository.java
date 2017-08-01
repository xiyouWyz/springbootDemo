package com.xiaoyou;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by xiaoyou.wyz on 2017/8/1.
 */
public interface GirlRepository extends JpaRepository<Girl,Integer> {
    public List<Girl> findByAge(int age);
}
