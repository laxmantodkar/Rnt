package com.rnt.operation.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class WebXmlConfiguration extends AbstractAnnotationConfigDispatcherServletInitializer
{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class [] brr= {AppConfiguration.class};
		return brr;
	}

	@Override
	protected String[] getServletMappings() {
		String [] arr= {"/"};
		return arr;
	}

}

