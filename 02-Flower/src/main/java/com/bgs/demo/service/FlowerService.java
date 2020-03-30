package com.bgs.demo.service;

import com.bgs.demo.pojo.Flower;

import java.util.List;

public interface FlowerService {

    List<Flower> selFlowerInfo();

    int addFlower(Flower flower);
}
