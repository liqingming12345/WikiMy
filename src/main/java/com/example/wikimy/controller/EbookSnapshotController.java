package com.example.wikimy.controller;

import com.example.wikimy.domain.EbookSnapshot;

import com.example.wikimy.service.EbookSnapshotService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
//@Controller
@RequestMapping("/ebookSnapshot")
public class EbookSnapshotController {

    @Resource
    private EbookSnapshotService ebookSnapshotService;

    @RequestMapping("/list123")
    public List<EbookSnapshot> list(){
        return ebookSnapshotService.list();

    }
}
