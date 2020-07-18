package com.atguigu.springcloud.Controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author: HUIZHENG
 * @Description:
 * @Date: 2020/7/8 22:27
 * @Version: 1.0
 */
@RestController
@Slf4j
public class OrderZKController {
        private static final String PAYMENT_URI = "http://cloud-provider-payment";
//    private static final String PAYMENT_URI = "http://CLOUD-PAYMENT-SERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String payInfo() {
        String result = restTemplate.getForObject(PAYMENT_URI + "/payment/zk", String.class);
        return result;
    }
}
