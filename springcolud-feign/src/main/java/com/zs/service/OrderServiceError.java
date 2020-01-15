package com.zs.service;

import com.zs.dto.shangpin;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@RequestMapping("error")
@Component
public class OrderServiceError implements QueryServiceFeign {


    @Override
    public HashMap<String,Object> shcx() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("info","上海查询错误");
        return map;
    }

    @Override
    public HashMap<String, Object> beijing() {

        HashMap<String, Object> map = new HashMap<>();
        map.put("info","北京查询错误");

        return map;
    }

    @Override
    public HashMap<String, Object> chengduchaxun() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("info","成都查询错误");
        return map;
    }

    @Override
    public HashMap<String, Object> chaxuangz() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("info","广州查询错误");
        return map;
    }

    @Override
    public HashMap<String, Object> hangzong() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("info","杭州查询错误");
        return map;
    }

    @Override
    public HashMap<String, Object> shenzhen() {
        HashMap<String, Object> map = new HashMap<>();
        map.put("info","深圳查询错误");
        return map;
    }

    /*@Override
    public HashMap<String, Object> quanbucha(shangpin sp) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("info","全部查询错误");
        return map;
    }
*/

}