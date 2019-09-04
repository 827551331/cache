package com.cloud.cache.controller;

import com.cloud.cache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cache")
public class cacheCtrl {

    @Autowired
    private UserService userServiceImpl;


    @GetMapping("/getUser")
    public String getUserInfo(@RequestParam String userNo) {
        return userServiceImpl.getUserInfo(userNo);
    }

    @GetMapping("/updateUser")
    public String updateUserInfo(@RequestParam String userNo) {
        return userServiceImpl.updateUserInfo(userNo);
    }
}
