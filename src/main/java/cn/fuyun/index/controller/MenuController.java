package cn.fuyun.index.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.fuyun.index.domain.User;

/**
 * ��ҳ����ͼ������
 * 
 * @author 64839
 *
 */
@Controller
public class MenuController {

	/**
	 * ��������ҳ
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	/**
	 *  ��������½ҳ��
	 * @return
	 */
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	/**
	 *  ��������½ҳ��
	 * @return
	 */
	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String checkLogin(User user, HttpServletRequest request, HttpServletResponse response) {
		HttpSession session = request.getSession();
		session.setAttribute("user", user);
		System.out.println(user);
		return "redirect:/";
	}
}
