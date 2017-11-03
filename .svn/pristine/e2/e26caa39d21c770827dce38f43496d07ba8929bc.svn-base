package com.richinfo.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.richinfo.dao.AuthDao;
import com.richinfo.pojo.Auth;
import com.richinfo.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService{
	@Resource
	private AuthDao authDao;
	
	
	public List<Auth> findAllAuth() {
		List<Auth> auth = authDao.findAllAuth();
		return auth;
	}

	
}
