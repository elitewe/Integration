package com.ztx.shares.service;

import com.ztx.shares.pojo.*;

import java.util.List;

public interface SearchService {
    Result selectAllCompany();

    Result selectCompanyById(int id);

    Result selectCompanyByCode(String code);

    Result selectAllExpress();

    Result selectExpressById(int id);

    Result selectExpressByCode(String code);

    Result selectDailyByDate(String day);

    Result selectDailyBetweenDate(String startDay, String endDay);

    Result selectDailyByCodeAndDate(String code, String day);

    Result selectDailyByCodeBetweenDate(String code, String startDay, String endDay);

    Result selectAllStock();

    Result selectStockById(int id);

    Result selectStockByCode(String code);

    Result getAnalysis(String code);

    Result selectWeeklyByCode(String code);

    Result selectMonthlyByCode(String code);

    Result selectIndexDailyByCodeBetweenDate(String code, String startDay, String endDay);
}
