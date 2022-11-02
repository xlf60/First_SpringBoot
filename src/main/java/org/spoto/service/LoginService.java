package org.spoto.service;

import org.spoto.model.Teacher;

public interface LoginService {

    Teacher doLogin(String tname, String tpasswd);
}
