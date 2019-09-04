package com.cloud.cache.service.impl;

import com.cloud.cache.service.UserService;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Cacheable(cacheNames = "users", key = "#userNo")
    @Override
    public String getUserInfo(String userNo) {
        System.out.println("未使用缓存");
        return "小白白";
    }


    @CachePut(cacheNames = "users", key = "#userNo")
    @Override
    public String updateUserInfo(String userNo) {
        System.out.println("未使用缓存");
        return "小白白";
    }
}
