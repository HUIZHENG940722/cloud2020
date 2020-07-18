package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @Author: HUIZHENG
 * @Description: 支付服务接口
 * @Date: 2020/7/4 15:30
 * @Version: 1.0
 */
@Service
public interface PaymentService {
    /**
     * 创造支付信息
     * @param payment
     * @return
     */
    int create(Payment payment);

    /**
     * 读取支付信息
     * @param id
     * @return
     */
    Payment getPaymentById(Long id);
}
