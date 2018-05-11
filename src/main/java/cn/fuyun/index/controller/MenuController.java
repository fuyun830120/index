package cn.fuyun.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页的视图控制器
 * 
 * @author 64839
 *
 */
@Controller
public class MenuController {

	/**
	 * 解析到主页
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String home() {
		return "home";
	}
}
