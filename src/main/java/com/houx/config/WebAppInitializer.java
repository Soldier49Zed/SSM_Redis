package com.houx.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration.Dynamic;

/**
 * @Author: HouX
 * @Date: 2020/12/8
 * @Description:
 */
public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    //Spring IoC环境配置
    protected Class<?>[] getRootConfigClasses() {
        //配置Spring IoC资源
        return new Class<?>[]{RootConfig.class};
    }

    //DispatcherServlet环境配置 前端控制器
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{WebConfig.class};
    }

    //DispatcherServlet拦截请求配置
    protected String[] getServletMappings() {
        return new String[]{"*.do"};
    }

    /**
     * @param dynamic Servlet上传文件配置
     */
    @Override
    protected void customizeRegistration(Dynamic dynamic) {
        //配置上传文件路径
        String filepath = "e:/mvc/uploads";
        //5MB
        Long singleMax = (long) (5 * Math.pow(2, 20));
        //10MB
        Long totalMax = (long) (10 * Math.pow(2, 20));
        //设置上传文件配置
        dynamic.setMultipartConfig(new MultipartConfigElement(filepath, singleMax, totalMax, 0));
    }
}
