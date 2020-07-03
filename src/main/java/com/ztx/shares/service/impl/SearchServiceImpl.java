package com.ztx.shares.service.impl;

import com.ztx.shares.mapper.SearchMapper;
import com.ztx.shares.pojo.*;
import com.ztx.shares.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    SearchMapper searchMapper;

    @Override
    public Result selectAllCompany() {
        List<Company> companyList = searchMapper.selectAllCompany();
        Result result = new Result(true, companyList);
        return result;
    }

    @Override
    public Result selectCompanyById(int id) {
        Company company = searchMapper.selectCompanyById(id);
        Result result = new Result(true, company);
        return result;
    }

    @Override
    public Result selectCompanyByCode(String code) {
        Company company = searchMapper.selectCompanyByCode(code);
        Result result = new Result(true, company);
        return result;
    }

    @Override
    public Result selectAllExpress() {
        List<Express> expressList = searchMapper.selectAllExpress();
        Result result = new Result(true, expressList);
        return result;
    }

    @Override
    public Result selectExpressById(int id) {
        Express express = searchMapper.selectExpressById(id);
        Result result = new Result(true, express);
        return result;
    }

    @Override
    public Result selectExpressByCode(String code) {
        Express express = searchMapper.selectExpressByCode(code);
        Result result = new Result(true, express);
        return result;
    }

    @Override
    public Result selectDailyByDate(String day) {
        List<Daily> dailyList = searchMapper.selectDailyByDate(day);
        Result result = new Result(true, dailyList);
        return result;
    }

    @Override
    public Result selectDailyBetweenDate(String startDay, String endDay) {
        List<Daily> dailyList = searchMapper.selectDailyBetweenDate(startDay, endDay);
        Result result = new Result(true, dailyList);
        return result;
    }

    @Override
    public Result selectDailyByCodeAndDate(String code, String day) {
        List<Daily> dailyList = searchMapper.selectDailyByCodeAndDate(code, day);
        Result result = new Result(true, dailyList);
        return result;
    }

    @Override
    public Result selectDailyByCodeBetweenDate(String code, String startDay, String endDay) {
        List<Daily> dailyList = searchMapper.selectDailyByCodeBetweenDate(code, startDay, endDay);
        Result result = new Result(true, dailyList);
        return result;
    }

    @Override
    public Result selectAllStock() {
        List<MStock> stockList = searchMapper.selectAllStock();
        Result result = new Result(true, stockList);
        return result;
    }

    @Override
    public Result selectStockById(int id) {
        MStock stock = searchMapper.selectStockById(id);
        Result result = new Result(true, stock);
        return result;
    }

    @Override
    public Result selectStockByCode(String code) {
        MStock stock = searchMapper.selectStockByCode(code);
        Result result = new Result(true, stock);
        return result;
    }

    @Override
    public Result getAnalysis(String code) {
        Double pctChg = searchMapper.getPctChgById(code);
        int up=searchMapper.getUpById(code);
        int down=searchMapper.getDownById(code);
        Double profit=searchMapper.getProfitById(code)/100000000;
        Double profitRate=searchMapper.getProfitRateById(code) / 100;
        Double recommend=(pctChg*100+up*1.0/(up+down)*100+profitRate*100+200)/5;
        Result result = new Result(true, new Analysis(code,pctChg,up,down,profit,profitRate,recommend));
        return result;
    }

    @Override
    public Result selectWeeklyByCode(String code) {
        List<Weekly> weekly = searchMapper.selectWeeklyByCode(code);
        Result result = new Result(true, weekly);
        return result;
    }

    @Override
    public Result selectMonthlyByCode(String code) {
        List<Monthly> monthly = searchMapper.selectMonthlyByCode(code);
        Result result = new Result(true, monthly);
        return result;
    }

    @Override
    public Result selectIndexDailyByCodeBetweenDate(String code, String startDay, String endDay) {
        List<IndexDaily> indexDailyList = searchMapper.selectIndexDailyByCodeBetweenDate(code, startDay, endDay);
        Result result = new Result(true, indexDailyList);
        return result;
    }
}
