package com.luying.cloud.config.druid;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/26 下午10:14
 * @modified
 */
@Component
@ConfigurationProperties(prefix = "spring.datasource.druid.web-stat-filter")
public class DruidWebStatFilterProperties {
    private String urlPattern;
    private String exclusions;

    public String getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String getExclusions() {
        return exclusions;
    }

    public void setExclusions(String exclusions) {
        this.exclusions = exclusions;
    }
}
