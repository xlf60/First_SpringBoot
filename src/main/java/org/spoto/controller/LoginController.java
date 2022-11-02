package org.spoto.controller;

import com.alibaba.fastjson.JSONObject;
import org.spoto.model.Teacher;
import org.spoto.service.LoginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {

    @Resource
    private LoginService ls;

    @RequestMapping("dologin")
    public JSONObject dologin(String tname, String tpasswd, HttpServletRequest request){

        JSONObject d = new JSONObject();

        Teacher th = ls.doLogin(tname, tpasswd);
        if (th != null) {
            //登录成功后存状态
            d.put("type",true);
        }else {
            d.put("type",false);
        }
        return d;
    }
}
