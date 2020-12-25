package com.ruichaung.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.ruichuang.springcloud.entitys.Payment;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author chengkexing
 */
@RestController
@RequestMapping("order")
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("payment/create")
    public R create(@RequestBody Payment payment){
        return restTemplate.postForObject( PAYMENT_URL + "/payment/create",payment , R.class);
    }

    @GetMapping("payment/getPayment/{id}")
    public R getPayment(@PathVariable String id){
        return restTemplate.getForObject( PAYMENT_URL + "/payment/getById/"+id , R.class);
    }
}
