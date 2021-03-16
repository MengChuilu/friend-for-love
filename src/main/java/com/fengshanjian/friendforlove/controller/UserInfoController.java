package com.fengshanjian.friendforlove.controller;

import com.fengshanjian.friendforlove.repo.model.Member;
import com.fengshanjian.friendforlove.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class UserInfoController {

    @Resource
    public UserService service;

    @GetMapping("/user/info")
    public Member getOpenId(@RequestParam(value = "openId", defaultValue = "") String openId) {
        Member result = service.getUserInfoByOpenId(openId);
        System.out.println(result);

        return result;
    }
}
