package com.richinfo.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.richinfo.pojo.Auth;
import com.richinfo.service.AuthService;
import com.richinfo.util.AlarmLogHandler;
import com.richinfo.util.BaseLogger;
import com.richinfo.util.SystemLogHandler;

@Controller
@RequestMapping("/richinfo/auth")
public class AuthController {

	AlarmLogHandler ah=AlarmLogHandler.getLogger(AuthController.class);
	SystemLogHandler slg=SystemLogHandler.getLogger(AuthController.class);
	@Resource
	private AuthService authService;
	
	@RequestMapping("/showAuth")
	public ModelAndView AuthCtrl() {
		ModelAndView mv = new ModelAndView("/index_left.jsp");
		List<Auth> auth = authService.findAllAuth();
	    mv.addObject("Auth", auth);
//	    model.addAllAttributes(students);
//		System.out.println("11111");
	    ah.warn("123456789", null);
	    slg.info("chen2014ylj");
		return mv;
	}
}

