package com.zs.dao;
import com.zs.dto.shangpin;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface MovieRepository extends ElasticsearchRepository<shangpin,Integer> {

}
