package com.yc.c112s2plyqnzf.util;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Collections;

@SpringBootApplication
@MapperScan("com.yc.c112s2plyqnzf.mapper")

public class MybatisPlusGenerator {

    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://127.0.0.1/C112-S2-Ply-qnzf", "root", "a")
                .globalConfig(builder -> {
                    builder.author("yc") // 设置作者
                            //.enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("E:\\IdeaProjects\\0628"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.yc") // 设置父包名
                            .moduleName("c112s2plyqnzf") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, "E:\\IdeaProjects\\0628")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder//.addInclude("t_simple") // 设置需要生成的表名
                            .addTablePrefix("qnzf_"); // 设置过滤表前缀
                })
                //.templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }

}
