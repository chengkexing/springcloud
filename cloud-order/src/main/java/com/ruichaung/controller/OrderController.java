package com.ruichaung.controller;

import com.baomidou.mybatisplus.extension.api.R;
import com.ruichaung.entity.Payment;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
}
