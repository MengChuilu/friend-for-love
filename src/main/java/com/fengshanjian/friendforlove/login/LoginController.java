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

    private final static String loginUrl = "https://api.weixin.qq.com";

    @Value("${wx.appid}")
    public String appId;
    @Value("${wx.secret}")
    public String secretId;

    @GetMapping("/login/code")
    public String getOpenId(@RequestParam(value = "code", defaultValue = "") String openId) {
        Map<String, String> params = new HashMap<>();
        params.put("appid", "wx0104cc3a694ba2e0");
        params.put("secret", "dfccfe0ac5907bb5a886e8089d011816");
        params.put("js_code", openId);
        params.put("grant_type", "authorization_code");
        String response = HttpClient.get(loginUrl, "sns/jscode2session", params);
        System.out.println(response);
        return response;
    }
}
