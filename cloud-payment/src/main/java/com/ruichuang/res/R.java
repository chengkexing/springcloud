package com.ruichuang.res;

import lombok.Data;

import java.util.HashMap;

/**
 * @author chengkexing
 * 封装一个返回体
 */
@Data
public class R extends HashMap<String, Object> {
    private R(){
        put("code", 0);
        put("msg", "异常");
    }
    private R(Integer code,String msg){
        put("code", code);
        put("msg", msg);
    }
    public static R ok(String message){
        return new R(200,message);
    }
    @Override
    public R put(String key, Object message){
        super.put(key ,message);
        return this;
    }
    public static R error(String message){
        return new R(500,message);
    }

}
