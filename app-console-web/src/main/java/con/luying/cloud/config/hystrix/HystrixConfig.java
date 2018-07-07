package con.luying.cloud.config.hystrix;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author luoming
 * @version V1.0
 * @description Hystrix对Hystrix dashboard的支持（2.0以上版本需要添加此配置）
 * @creater 2018/7/5 下午4:14
 * @modified
 */
@Configuration
public class HystrixConfig {

    @Bean
    public HystrixMetricsStreamServlet hystrixMetricsStreamServlet(){
        return new HystrixMetricsStreamServlet();
    }

    @Bean
    public ServletRegistrationBean registration(HystrixMetricsStreamServlet servlet){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean();
        registrationBean.setServlet(servlet);
        //是否启用该registrationBean
        registrationBean.setEnabled(true);
        registrationBean.addUrlMappings("/hystrix.stream");
        return registrationBean;
    }
}
