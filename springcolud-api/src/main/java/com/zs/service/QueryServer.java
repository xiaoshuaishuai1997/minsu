package com.zs.service;
import com.zs.dto.shangpin;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.HashMap;

public interface QueryServer {

    @GetMapping("pos/cxsh")
    HashMap<String,Object> shcx();
    @GetMapping("pos/beijing")
    HashMap<String, Object> beijing();
    @GetMapping("pos/chaxcdu")
    HashMap<String, Object> chengduchaxun();
    @GetMapping("pos/chaxguangz")
    HashMap<String, Object> chaxuangz();
    @GetMapping("pos/hangzo")
    HashMap<String, Object> hangzong();
    @GetMapping("pos/senzen")
    HashMap<String, Object> shenzhen();
    /*@GetMapping("pos/quanbcx")
    HashMap<String, Object> quanbucha(shangpin sp);*/
}
