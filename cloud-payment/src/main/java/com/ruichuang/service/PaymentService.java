package com.ruichuang.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ruichuang.entity.Payment;
import com.ruichuang.mapper.PaymentMapper;
import org.springframework.stereotype.Service;

/**
 * @author chengkexing
 */
@Service("paymentService")
public class PaymentService extends ServiceImpl<PaymentMapper,Payment> {


}
