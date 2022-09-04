package com.yc.c112s2plyqnzf.controller;


import com.yc.c112s2plyqnzf.entity.District;
import com.yc.c112s2plyqnzf.mapper.DistrictMapper;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 青鸟租房-地区表-1006 前端控制器
 * </p>
 *
 * @author yc
 * @since 2022-09-03
 */
@RestController
@RequestMapping("/c112s2plyqnzf/district")
public class DistrictController {

    @Resource
    private DistrictMapper districtMapper;

    @RequestMapping("queryAll")
    public List<District> queryAll(){
        return districtMapper.selectList(null);
    }

}

