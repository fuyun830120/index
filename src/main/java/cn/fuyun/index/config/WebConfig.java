package cn.fuyun.index.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import cn.fuyun.index.interceptor.LoginInterceptor;

/**
 * WebMvc��һЩ����
 * @author 64839
 *
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

	/**
	 * ���þ�̬��Դ
	 */
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
	}
	
	/**
	 * ����������
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/login/**", "/static/**");
	}
}
