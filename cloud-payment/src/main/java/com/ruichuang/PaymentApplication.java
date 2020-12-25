package com.ruichuang;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author chengkexing
 */
@SpringBootApplication
@Slf4j
@MapperScan(basePackages = {"com.ruichuang.mapper"})
public class PaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class,args);
    }

}
