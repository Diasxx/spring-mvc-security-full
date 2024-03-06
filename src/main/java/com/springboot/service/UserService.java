package com.springboot.service;

import com.springboot.entity.User;
import com.springboot.user.WebUser;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	User findByUserName(String userName);

	void save(WebUser webUser);

}
