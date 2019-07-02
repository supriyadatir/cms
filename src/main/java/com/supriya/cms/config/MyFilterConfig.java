package com.supriya.cms.config;

import com.supriya.cms.filter.MyNewFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyFilterConfig {

    @Bean
    public FilterRegistrationBean<MyNewFilter> registrationBean(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyNewFilter());
        registrationBean.addUrlPatterns("/customers/*");
        return registrationBean;
    }
}
