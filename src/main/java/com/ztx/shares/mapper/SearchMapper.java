package com.ztx.shares.mapper;

import com.ztx.shares.pojo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SearchMapper {
    List<Company> selectAllCompany();

    Company selectCompanyById(int id);

    Company selectCompanyByCode(String code);

    List<Express> selectAllExpress();

    Express selectExpressById(int id);

    Express selectExpressByCode(String code);

    List<Daily> selectDailyByDate(String day);

    List<Daily> selectDailyBetweenDate(String startDay, String endDay);

    List<Daily> selectDailyByCodeAndDate(String code, String day);

    List<Daily> selectDailyByCodeBetweenDate(String code, String startDay, String endDay);

    List<MStock> selectAllStock();

    MStock selectStockById(int id);

    MStock selectStockByCode(String code);

    Double getPctChgById(String code);

    int getUpById(String code);

    int getDownById(String code);

    Double getProfitById(String code);

    Double getProfitRateById(String code);

    List<Weekly> selectWeeklyByCode(String code);

    List<Monthly> selectMonthlyByCode(String code);

    List<IndexDaily> selectIndexDailyByCodeBetweenDate(String code, String startDay, String endDay);
}
