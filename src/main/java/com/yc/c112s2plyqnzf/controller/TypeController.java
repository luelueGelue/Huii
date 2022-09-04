package com.yc.c112s2plyqnzf.controller;


import com.yc.c112s2plyqnzf.entity.Type;
import com.yc.c112s2plyqnzf.mapper.TypeMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 青鸟租房-类别表-1008 前端控制器
 * </p>
 *
 * @author yc
 * @since 2022-09-03
 */
@RestController
@RequestMapping("/c112s2plyqnzf/type")
public class TypeController {

    @Resource
    private TypeMapper typeMapper;

    @GetMapping("queryAll")
    public List<Type> queryAll(){
        return typeMapper.selectList(null);
    }

}

