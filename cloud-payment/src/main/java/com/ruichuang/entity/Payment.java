package com.ruichuang.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author chengkexing
 */
@Data
@TableName("tb_payment")
public class Payment {
    private Integer id;
    private String serial;
}
