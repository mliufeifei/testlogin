package com.bgs.demo.controller;

import com.bgs.demo.pojo.Flower;
import com.bgs.demo.service.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class FlowerController {

    @Autowired
    private FlowerService flowerService;

    @RequestMapping("/selAllFlowerInfo")
    public String selAllFlowerInfo(Model model){
        List<Flower> list = flowerService.selFlowerInfo();
        model.addAttribute("list",list);

        return "index";
    }

    @RequestMapping("/insFlowerInfo")
    public String insFlowerInfo(){
        System.out.println("我是一个小测试");
        System.out.println("我是一个小测试"); System.out.println("我是一个小测试");
        System.out.println("我是一个小测试"); System.out.println("我是一个小测试");
        return "addFlower";
    }

    @RequestMapping("/addFlower")
    public String addFlower(Flower flower){

        int i = flowerService.addFlower(flower);
        System.out.println("12ewafksdafjsdfkldsj");
        if (i>0){
            return "success";
        }else {
            return "error";


        }

    }

}
