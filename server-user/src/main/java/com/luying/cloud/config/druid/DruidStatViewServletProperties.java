package com.luying.cloud.config.druid;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author luoming
 * @version V1.0
 * @description
 * @creater 2018/6/26 下午10:05
 * @modified
 */
@Component
@ConfigurationProperties(prefix = "spring.datasource.druid.stat-view-servlet")
public class DruidStatViewServletProperties {
    private String urlPattern;
    private String resetEnable;
    private String loginUsername;
    private String loginPassword;

    public String getUrlPattern() {
        return urlPattern;
    }

    public void setUrlPattern(String urlPattern) {
        this.urlPattern = urlPattern;
    }

    public String getResetEnable() {
        return resetEnable;
    }

    public void setResetEnable(String resetEnable) {
        this.resetEnable = resetEnable;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }
}
