package com.yc.c112s2plyqnzf.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yc.c112s2plyqnzf.entity.Street;
import com.yc.c112s2plyqnzf.mapper.StreetMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 青鸟租房-街道表-1003 前端控制器
 * </p>
 *
 * @author yc
 * @since 2022-09-03
 */
@RestController
@RequestMapping("/c112s2plyqnzf/street")
public class StreetController {

    @Resource
    private StreetMapper streetMapper;

    @GetMapping("queryByDid")
    public List<Street> queryByDid(int did){
        //条件构建器
        LambdaQueryWrapper<Street> lqw = new LambdaQueryWrapper<Street>();
        //添加查询条件  did = ?
        lqw.eq(Street::getDid, did);
        return streetMapper.selectList(lqw);
    }
}

