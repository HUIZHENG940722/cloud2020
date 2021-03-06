package com.atguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @Author: HUIZHENG
 * @Description:
 * @Date: 2020/7/10 14:33
 * @Version: 1.0
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/consul")
    public String payInfo() {
        return "springcloud with consul:" + serverPort + "\t\t" + UUID.randomUUID().toString();
    }
}
