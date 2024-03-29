package com.loan.service;

import com.github.pagehelper.PageInfo;
import com.loan.bean.Data;


import java.util.List;

/**
 * 职位数据接口
 */
public interface DataService {

    /**
     * 模糊查询职位数据
     */

    PageInfo<Data> getAllData(Data data, int limit, int page);


    /**
     * 工作经验与薪水的关系
     */
    List<Integer> getTask1();

    /**
     * 各公司性质工资最好的TOP10城市
     */
    List<Integer> getTask2();

    /**
     * 学历与薪水的关系
     */
    List<Integer> getTask3();

    /**
     * 各城市公司规模发布职位占比分析
     */
    List<Integer> getTask4();

    /**
     * 2020年1月-2020年6月，各城市招聘职位数量趋势图
     */
    List<Integer> getTask5();

    /**
     * 薪水与发布职位数量关系占比分析
     */
    List<Integer> getTask6();


}
