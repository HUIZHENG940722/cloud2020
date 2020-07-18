package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;


/**
 * @Author: HUIZHENG
 * @Description: 订单控制类
 * @Date: 2020/7/4 17:36
 * @Version: 1.0
 */
@RestController
@Slf4j
public class OrderController {
//    private static final String PAYMENT_URI = "http://localhost:8001";
    private static final String PAYMENT_URI = "http://CONSUL-PROVIDER-PAYMENT";



    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String payInfo() {
        String result = restTemplate.getForObject(PAYMENT_URI + "/payment/consul",
                String.class);
        return result;
    }
}
