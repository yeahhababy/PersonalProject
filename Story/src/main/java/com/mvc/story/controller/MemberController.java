package com.mvc.story.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.story.model.Member.Biz.MemberBiz;
import com.mvc.story.model.Member.Dto.MemberDto;

@Controller
public class MemberController {

	@Autowired
	private MemberBiz biz;
	
	private Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@RequestMapping("/join.do")
	public String joinform() {
		logger.info("join!!");
		return "member/joinpage";
	}
	
	@RequestMapping("/login.do")
	public String loginform() {
		logger.info("login!!");
		return "member/loginpage";
	}
	
	@RequestMapping("/joining.do")
	public String joining(HttpServletRequest request) {
		logger.info("회원가입중...");
		
		MemberDto dto = new MemberDto();
		
		dto.setMEMBER_ID(request.getParameter("memberid"));
		dto.setMEMBER_NAME(request.getParameter("membername"));
		dto.setMEMBER_PW(request.getParameter("memberpw"));
		dto.setMEMBER_EMAIL(request.getParameter("memberemail"));
		dto.setMEMBER_PHONE(request.getParameter("memberphone"));
		dto.setMEMBER_ADDR(request.getParameter("memberaddr"));
		
		int res = biz.Member_insert();
		
		if(res > 0) {
			return "member/loginpage";
		}else {
			return "redirect:member/joinpage";
		}
	}
	
}
