package com.ztx.shares.controller;

import com.ztx.shares.pojo.Result;
import com.ztx.shares.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * controller
 *
 * @description 股票集成信息查询
 * @author 123456
 */
@RestController
@RequestMapping("/search")
public class SearchController {
    @Autowired
    SearchService searchService;

    /**
     * 查询所有公司
     */
    @GetMapping("/company/all")
    public Result selectAllCompany() {
        return searchService.selectAllCompany();
    }

    /**
     * 根据id查询公司
     * @param id company表id
     * @return
     */
    @GetMapping("/company/id/{id}")
    public Result selectCompanyById(@PathVariable int id) {
        return searchService.selectCompanyById(id);
    }

    /**
     * 根据code查询公司
     * @param code 股票代码（例如000001.SZ）
     * @return
     */
    @GetMapping("/company/code/{code}")
    public Result selectCompanyByCode(@PathVariable String code) {
        return searchService.selectCompanyByCode(code);
    }

    /**
     * 查询所有业绩信息
     * @return
     */
    @GetMapping("/express/all")
    public Result selectAllExpress() {
        return searchService.selectAllExpress();
    }

    /**
     * 根据id查询业绩
     * @param id express表id
     * @return
     */
    @GetMapping("/express/id/{id}")
    public Result selectExpressById(@PathVariable int id) {
        return searchService.selectExpressById(id);
    }

    /**
     * 根据code查询业绩
     * @param code 股票代码（例如：000001.sz）
     * @return
     */
    @GetMapping("/express/code/{code}")
    public Result selectExpressByCode(@PathVariable String code) {
        return searchService.selectExpressByCode(code);
    }

    /**
     * 根据日期查询日交易
     * @param day 日期（例如：20200601）
     * @return
     */
    @GetMapping("/daily/day/{day}")
    public Result selectDailyByDate(@PathVariable String day) {
        return searchService.selectDailyByDate(day);
    }

    /**
     * 范围查询日交易
     * @param startDay 开始日期（可取等）
     * @param endDay 结束日期（可取等）
     * @return
     */
    @GetMapping("/daily/between")
    public Result selectDailyBetweenDate(@RequestParam("startDay") String startDay, @RequestParam("endDay") String endDay) {
        return searchService.selectDailyBetweenDate(startDay, endDay);
    }

    /**
     * 根据code和日期查询日交易
     * @param code 股票代码
     * @param day 日期
     * @return
     */
    @GetMapping("/daily/code/day")
    public Result selectDailyByCodeAndDate(@RequestParam("code") String code, @RequestParam("day") String day) {
        return searchService.selectDailyByCodeAndDate(code, day);
    }

    /**
     * 根据code和日期范围查询日交易
     * @param code 股票代码
     * @param startDay 开始日期
     * @param endDay 结束日期
     * @return
     */
    @GetMapping("/daily/between3/")
    public Result selectDailyByCodeBetweenDate(@RequestParam("code") String code, @RequestParam("startDay") String startDay, @RequestParam("endDay") String endDay) {
        return searchService.selectDailyByCodeBetweenDate(code, startDay, endDay);
    }

    /**
     * 查询所有股票
     * @return
     */
    @GetMapping("/stock/all")
    public Result selectAllStock() {
        return searchService.selectAllStock();
    }

    /**
     * 根据id查询股票
     * @param id stock表id
     * @return
     */
    @GetMapping("/stock/id/{id}")
    public Result selectStockById(@PathVariable int id) {
        return searchService.selectStockById(id);
    }

    /**
     * 根据code查询股票
     * @param code 股票代码（例如：000001.sz）
     * @return
     */
    @GetMapping("/stock/code/{code}")
    public Result selectStockByCode(@PathVariable String code) {
        return searchService.selectStockByCode(code);
    }


    /**
     * 根据code获取股票推荐指数
     * @param code 股票代码（例如：000001.sz）
     * @return
     */
    @GetMapping("/stock/recommend/{code}")
    public Result getAnalysis(@PathVariable String code) {
        return searchService.getAnalysis(code);
    }
}
