package cn.fuyun.index.controller.rest;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.fuyun.index.domain.User;

@RestController
public class TestDataController {

	@RequestMapping("testData")
	public Map<String, String> tesData(User user) {
		System.out.println(user);
		Map<String, String> map = new HashMap<String, String>();
		map.put("testData", "TestData");
		return map;
	}
}
