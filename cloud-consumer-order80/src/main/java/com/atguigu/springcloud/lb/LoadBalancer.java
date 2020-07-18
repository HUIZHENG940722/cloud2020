package com.atguigu.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @Author: HUIZHENG
 * @Description: 自定义负载均衡接口
 * @Date: 2020/7/10 21:01
 * @Version: 1.0
 */
public interface LoadBalancer {
    /**
     * 获取服务全部信息
     * @param serviceInstances
     * @return
     */
    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
