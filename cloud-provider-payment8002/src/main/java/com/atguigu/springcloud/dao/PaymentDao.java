package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: HUIZHENG
 * @Description: 支付数据访问接口
 * @Date: 2020/7/4 14:50
 * @Version: 1.0
 */
@Mapper
public interface PaymentDao {
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
    Payment getPaymentById(@Param("id") Long id);
}
