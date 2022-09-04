package com.yc.c112s2plyqnzf.controller;


import com.yc.c112s2plyqnzf.entity.House;
import com.yc.c112s2plyqnzf.mapper.HouseMapper;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 青鸟租房-房屋表-2 前端控制器
 * </p>
 *
 * @author yc
 * @since 2022-09-03
 */
@RestController
@RequestMapping("/c112s2plyqnzf/house")
public class HouseController {

    @Resource
    private HouseMapper houseMapper;

    @RequestMapping("query")
    public List<House> query(){
        return houseMapper.selectList(null);
    }

}

