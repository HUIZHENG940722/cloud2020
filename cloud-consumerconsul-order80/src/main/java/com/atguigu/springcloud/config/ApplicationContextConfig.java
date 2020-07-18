package com.atguigu.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: HUIZHENG
 * @Description:
 * @Date: 2020/7/4 17:56
 * @Version: 1.0
 */
@Configuration
public class ApplicationContextConfig {
    /**
     * 注入RestTemplate类
     * @return
     */
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
