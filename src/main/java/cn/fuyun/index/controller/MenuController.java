package cn.fuyun.index.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
