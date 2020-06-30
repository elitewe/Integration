//package com.ztx.shares.controller;
//
//import com.ztx.shares.pojo.StockInfo;
//import com.ztx.shares.service.StockInfoService;
//import com.ztx.shares.service.StockService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//import java.util.Map;
//
//@RestController
//public class TestController {
//
//    @Autowired
//    StockService stockService;
//
//    @Autowired
//    StockInfoService stockInfoService;
//
//    //AllController中的方法无效
//    @GetMapping("/stockInfo")
//    public ModelAndView f(@RequestParam("stockId") String stockId, ModelAndView modelAndView) {
//        modelAndView.setViewName("stockInfo");
//        modelAndView.addObject("stock",stockService.findById(stockId));
//        return modelAndView;
//    }
//}
