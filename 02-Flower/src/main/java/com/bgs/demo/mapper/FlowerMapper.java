package com.bgs.demo.mapper;

import com.bgs.demo.pojo.Flower;

import java.util.List;

public interface FlowerMapper {


    List<Flower> selFlowerInfo();

    int addFlower(Flower flower);
}
