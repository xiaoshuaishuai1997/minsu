package com.zs.service;
import com.zs.dao.QueryDao;

import com.zs.dto.shangpin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class QueryServiceImpl implements QueryService{

    @Autowired
    private QueryDao queryDao;

    @Override
    public HashMap<String,Object> shcx() {

        HashMap<String,Object> map = new HashMap<String,Object>();
        List<shangpin> list = queryDao.shcx();
        map.put("rows",list);
        return map;
    }

    @Override
    public HashMap<String, Object> beijing() {
        HashMap<String,Object> map = new HashMap<String,Object>();
        List<shangpin> list = queryDao.beijing();
        map.put("rows",list);
        return map;
    }

    @Override
    public HashMap<String, Object> chengduchaxun() {
        HashMap<String,Object> map = new HashMap<String,Object>();
        List<shangpin> list = queryDao.chengduchaxun();
        map.put("rows",list);
        return map;
    }

    @Override
    public HashMap<String, Object> chaxuangz() {
        HashMap<String,Object> map = new HashMap<String,Object>();
        List<shangpin> list = queryDao.chaxuangz();
        map.put("rows",list);
        return map;
    }

    @Override
    public HashMap<String, Object> hangzong() {
        HashMap<String,Object> map = new HashMap<String,Object>();
        List<shangpin> list = queryDao.hangzong();
        map.put("rows",list);
        return map;
    }

    @Override
    public HashMap<String, Object> shenzhen() {
        HashMap<String,Object> map = new HashMap<String,Object>();
        List<shangpin> list = queryDao.shenzhen();
        map.put("rows",list);
        return map;
    }


}
