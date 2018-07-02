package com.luying.cloud.config.druid;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/26 上午10:40
 * @modified
 */
@Configuration
public class DataSourcesConfig {

    @Autowired
    DruidWebStatFilterProperties webStatFilterProperties;
    @Autowired
    DruidStatViewServletProperties statViewServletProperties;

    @ConfigurationProperties(prefix = "spring.datasource.druid")
    @Bean
    public DataSource druid() {
        return new DruidDataSource();
    }

    //配置Druid的监控
    //1、配置一个管理后台的Servlet
    @Bean
    public ServletRegistrationBean statViewServlet() {
        Properties properties = System.getProperties();
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(),
                statViewServletProperties.getUrlPattern());
        Map<String, String> initParams = new HashMap<>(8);

        initParams.put("loginUsername", statViewServletProperties.getLoginUsername());
        initParams.put("loginPassword", statViewServletProperties.getLoginPassword());
//        initParams.put("allow", "");//设置系统白名单
        //initParams.put("deny", "192.168.15.21");//配置系统黑名单

        bean.setInitParameters(initParams);
        return bean;
    }

    //2、配置一个web监控的filter
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());

        Map<String, String> initParams = new HashMap<>(8);
        initParams.put("exclusions", webStatFilterProperties.getExclusions());

        bean.setInitParameters(initParams);

        bean.setUrlPatterns(Arrays.asList(webStatFilterProperties.getUrlPattern()));

        return bean;
    }
}
