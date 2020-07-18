package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author: HUIZHENG
 * @Description: 主启动类
 * @Date: 2020/7/8 21:15
 * @Version: 1.0
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class PaymentMain8004 {
    @GetMapping("/payment/zk")
    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8004.class, args);
    }
}
