package com.ztx.shares;

import com.ztx.shares.mapper.StockInfoMapper;
import com.ztx.shares.service.JsoupService;
import com.ztx.shares.service.StockInfoService;
import com.ztx.shares.util.JsoupUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SharesApplicationTests {
    @Resource
    StockInfoMapper stockInfoMapper;
    @Resource
    StockInfoService stockInfoService;
    @Resource
    JsoupService jsoupService;
    @Test
    public void contextLoads() {
        //初始化stockInfo表，默认有1000条记录
       jsoupService.initYearInfo(
               JsoupUtil.urls[0],"sz000004",0);
    }

    @Test
    public void testStock() {
        jsoupService.initStock(); //该方法用于初始化stock表
    }

}
