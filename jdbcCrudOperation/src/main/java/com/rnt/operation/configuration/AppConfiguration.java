package com.rnt.operation.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configurable
@ComponentScan(basePackages = "com.rnt.operation")
public class AppConfiguration implements WebMvcConfigurer
{
	@Bean
    public InternalResourceViewResolver viewResolver()
    {
    	InternalResourceViewResolver vw=new InternalResourceViewResolver();
    	vw.setPrefix("/WEB-INF/views/");
    	vw.setSuffix(".jsp");
		return vw;
    }
	
	
	public void addResourceHandlers(ResourceHandlerRegistry registry)
	{
		registry.addResourceHandler("/resources/**").addResourceLocations("classpath:/static/");
	}
	
	
}
