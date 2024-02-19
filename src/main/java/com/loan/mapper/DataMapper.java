package com.loan.mapper;

import com.loan.bean.Data;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 职位数据dao层接口
 */
public interface DataMapper extends Mapper<Data> {
    @Select("SELECT * FROM table_marital_status ORDER BY marital_status DESC")
    List<Map<String, Integer>> getTask2();

    @Select("SELECT * FROM table_age ORDER BY AgeInterval DESC")
    List<Map<String, Integer>> getTask3();

    @Select("SELECT * FROM table_income ORDER BY IncomeInterval DESC")
    List<Map<String, Integer>> getTask4();

    @Select("SELECT * FROM table_interest_rate ORDER BY ApprovalRate ASC")
    List<Map<String, Integer>> getTask5();

    @Select("SELECT * FROM table_months_employed ORDER BY MonthsEmployedInterval ASC")
    List<Map<String, Integer>> getTask6();
}
