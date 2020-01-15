package com.zs.controller;
import com.zs.dto.shangpin;
import com.zs.service.QueryServer;
import com.zs.service.QueryServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
@RequestMapping("pos")
public class QuerController {

    @Autowired
    private QueryServer queryServer;

    //展示页面
    @GetMapping("zhanshi")
    public String zhanshi(){

        return "qiantai";
    }

    //登录页面
    @GetMapping("dengl")
    public String denglu(){

        return "denglu";
    }

    //注册页面
    @GetMapping("zhuche")
    public String zhuce(){

        return "zhuche";
    }

    //忘记密码
    @GetMapping("wjmm")
    private String wangjimama(){

        return "wangjimima";
    }

    //网站信息
    @GetMapping("kefuxinxi")
    private String kefuxinxi(){

        return "kefu";
    }

    //上海页面
    @GetMapping("shanghai")
    private String shangh(){

        return "qiantai";
    }

    //北京页面
    @GetMapping("beijing")
    private String beijing(){

        return "diqu/beijing";
    }
    //成都页面
    @GetMapping("chengdu")
    private String chegdu(){

        return "diqu/chengdu";
    }
       //广州页面
    @GetMapping("guangz")
    private String gungz(){

        return "diqu/guangz";
    }

       //杭州页面
    @GetMapping("hangz")
    private String hagz(){

        return "diqu/hangz";
    }

       //深圳页面
    @GetMapping("shenzen")
    private String shnzen(){

        return "diqu/shenzen";
    }

    //上海查询
    @GetMapping("shai")
    @ResponseBody
    public HashMap<String,Object> shcx(){

        HashMap<String, Object> map = queryServer.shcx();
        return map;
    }

    //北京查询
    @GetMapping("cxbj")
    @ResponseBody
    public HashMap<String,Object> beij(){

        HashMap<String, Object> map = queryServer.beijing();

        return map;
    }

    //成都查询
    @GetMapping("chaxcdu")
    @ResponseBody
    public HashMap<String,Object> chengduhaxun(){
        HashMap<String, Object> map = queryServer.chengduchaxun();
        return map;
    }

  //广州查询
    @GetMapping("chaxguangz")
    @ResponseBody
    public HashMap<String,Object> chaxuangz(){

        HashMap<String, Object> map = queryServer.chaxuangz();

        return map;
    }

    //杭州查询
    @GetMapping("hangzong")
    @ResponseBody
    public HashMap<String,Object> hanzong(){

        HashMap<String, Object> map = queryServer.hangzong();

        return map;
    }


    //深圳查询
    @GetMapping("shenzhen")
    @ResponseBody
    public HashMap<String,Object> shezhen(){

        HashMap<String, Object> map = queryServer.shenzhen();

        return map;
    }

    //点击更多
    @GetMapping("gengduo")
    public String tiaozhuangengduo(){

        return "diqu/gengduo";
    }

    //详情
    @GetMapping("xiangqing")
    public String toupdateStu(Integer couId, shangpin ss, Model model){
       /* ss = queryServer.toupdateStu(couId);
        model.addAttribute("w",ss);*/
        return "xiangqing";
    }



}
