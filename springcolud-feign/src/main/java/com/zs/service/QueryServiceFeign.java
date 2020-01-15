package com.zs.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "cloud-provider",fallback = OrderServiceError.class)//封装了ribbon的功能
public interface QueryServiceFeign extends QueryServer {


}
