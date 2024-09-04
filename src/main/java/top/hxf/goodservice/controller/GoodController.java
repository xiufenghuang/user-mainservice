package top.hxf.goodservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能：
 * 作者：程序员青戈
 * 日期：2024/9/4 10:51
 */
@RestController
public class GoodController{
    @GetMapping("/good")
    public String getGood(@RequestParam String goodId){// 模拟产品信息
         return"Good   : "+goodId;}
}
