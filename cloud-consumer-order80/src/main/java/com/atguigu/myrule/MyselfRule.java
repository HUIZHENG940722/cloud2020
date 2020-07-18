package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: HUIZHENG
 * @Description:
 * @Date: 2020/7/10 20:12
 * @Version: 1.0
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule getMyRule() {
        return new RandomRule();
    }
}
