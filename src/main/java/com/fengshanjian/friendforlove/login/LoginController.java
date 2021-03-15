package com.fengshanjian.friendforlove.login;

import com.fengshanjian.friendforlove.Utils.HttpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoginController {

    String loginUrl = "https://api.weixin.qq.com/sns/jscode2session?" +
            "appid=APPID&secret=SECRET&js_code=JSCODE&grant_type=authorization_code";

    @Value("$wx.appid")
    private String appId;
    @Value("$wx.secret")
    private String secretId;

    @GetMapping("/login/openId")
    public String getOpenId(@RequestParam(value = "openId", defaultValue = "") String openId) {
        Map<String, String> params = new HashMap<>();
        params.put("appid", appId);
        params.put("secret", secretId);
        params.put("js_code", openId);
        params.put("grant_type", "authorization_code");
        String response = HttpClient.get(loginUrl, "", params);
        System.out.println(response);

        return "";
    }
}
