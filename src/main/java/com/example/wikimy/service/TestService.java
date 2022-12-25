package com.example.wikimy.service;

import com.example.wikimy.domain.Test;
import com.example.wikimy.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    private TestMapper tstMapper;

    public List<Test> list(){
        return tstMapper.list();
    }
}
