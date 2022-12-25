package com.example.wikimy.service;

import com.example.wikimy.domain.EbookSnapshot;
import com.example.wikimy.mapper.EbookSnapshotMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookSnapshotService {

    @Resource
    private EbookSnapshotMapper ebookSnapshotMapper;

    public List<EbookSnapshot> list(){
        return ebookSnapshotMapper.selectByExample(null);
    }
}
