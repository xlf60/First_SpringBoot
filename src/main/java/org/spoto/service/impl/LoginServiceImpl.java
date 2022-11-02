package org.spoto.service.impl;

import org.spoto.dao.LoginMapper;
import org.spoto.model.Teacher;
import org.spoto.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginServiceImpl implements LoginService {

    @Resource
    private LoginMapper lm;

    @Override
    public Teacher doLogin(String tname, String tpasswd) {
        return lm.doLogin(tname,tpasswd);
    }
}
