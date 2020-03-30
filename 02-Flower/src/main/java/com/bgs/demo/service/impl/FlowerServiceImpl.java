package com.bgs.demo.service.impl;

import com.bgs.demo.mapper.FlowerMapper;
import com.bgs.demo.pojo.Flower;
import com.bgs.demo.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerServiceImpl implements FlowerService {

    @Autowired
    private FlowerMapper flowerMapper;

    @Override
    public List<Flower> selFlowerInfo() {
        return flowerMapper.selFlowerInfo();
    }

    @Override
    public int addFlower(Flower flower) {
        return flowerMapper.addFlower(flower);
    }
}
