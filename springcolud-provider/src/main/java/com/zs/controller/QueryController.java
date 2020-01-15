package com.zs.controller;
import com.zs.dto.shangpin;
import com.zs.service.QueryServer;
import com.zs.service.QueryService;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;
import org.elasticsearch.search.fetch.subphase.highlight.HighlightField;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("pos")
public class QueryController implements QueryServer {

    @Autowired
    private QueryService queryService;



    //上海查询
    @GetMapping("cxsh")
    @Override
    public HashMap<String,Object> shcx() {

        return queryService.shcx();
    }
    //北京查询
    @GetMapping("beijing")
    @Override
    public HashMap<String, Object> beijing() {

        return queryService.beijing();
    }
    //成都查询
    @GetMapping("chaxcdu")
    @Override
    public HashMap<String, Object> chengduchaxun() {

        return queryService.chengduchaxun();
    }

    //成都查询
    @GetMapping("chaxguangz")
    @Override
    public HashMap<String, Object> chaxuangz() {

        return queryService.chaxuangz();
    }
    //杭州查询
    @GetMapping("hangzo")
    @Override
    public HashMap<String, Object> hangzong() {

        return queryService.hangzong();
    }
    //深圳查询
    @GetMapping("senzen")
    @Override
    public HashMap<String, Object> shenzhen() {

        return queryService.shenzhen();
    }





}