package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentFeignService;

/**
 * @Author: HUIZHENG
 * @Description:
 * @Date: 2020/7/16 22:03
 * @Version: 1.0
 */
public class PaymentFeignServiceImpl implements PaymentFeignService {

    @Override
    public CommonResult<Payment> getPaymentById(Long id) {
        return null;
    }
}
