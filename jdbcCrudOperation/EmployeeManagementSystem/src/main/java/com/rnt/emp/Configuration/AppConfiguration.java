package com.rnt.emp.Configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configurable
@ComponentScan(basePackages = "com.rnt.emp")
public class AppConfiguration 
{
	@Bean
    public InternalResourceViewResolver viewResolver()
    {
    	InternalResourceViewResolver vw=new InternalResourceViewResolver();
    	vw.setPrefix("/WEB-INF/views/");
    	vw.setSuffix(".jsp");
		return vw;
    }
	//connection to database
	@Bean
	 DriverManagerDataSource getDataSource()
	 {
		 DriverManagerDataSource ds=new DriverManagerDataSource();
		 ds.setDriverClassName("com.mysql.jdbc.Driver");
		 ds.setUrl("jdbc:mysql://localhost:3306/spring?useSSL=false");
		 ds.setUsername("root");
		 ds.setPassword("root");
		return ds;
	 }
	 
	 @Bean
	 public JdbcTemplate jdbcTemplat()
	 {
		 return new JdbcTemplate((javax.sql.DataSource) getDataSource());
	 }
}
