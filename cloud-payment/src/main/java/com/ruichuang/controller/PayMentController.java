package com.ruichuang.controller;

import com.ruichuang.entity.Payment;
import com.ruichuang.res.R;
import com.ruichuang.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chengkexing
 */
@RestController
@RequestMapping("payment")
public class PayMentController {

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/test")
    public String test(){
        return "111";
    }

    @GetMapping("/getById/{id}")
    public R test(@PathVariable String id){
        Payment byId = paymentService.getById(id);
        System.out.println( byId );
        return R.ok("成功").put("data", byId );
    }
    @PostMapping("/create")
    public R test(@RequestBody Payment payment){
        boolean save = paymentService.save(payment);
        return R.ok("成功").put("data", payment );
    }
}
