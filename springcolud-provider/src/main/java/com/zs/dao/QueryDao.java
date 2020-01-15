package com.zs.dao;

import com.zs.dto.shangpin;


import java.util.List;

public interface QueryDao {
//============前台热门城市展示============================
    //上海查询
    List<shangpin> shcx();
    //北京查询
    List<shangpin> beijing();
    //成都查询
    List<shangpin> chengduchaxun();
    //广州查询
    List<shangpin> chaxuangz();
    //杭州查询
    List<shangpin> hangzong();
    //深圳查询
    List<shangpin> shenzhen();
//==========================================================
}
