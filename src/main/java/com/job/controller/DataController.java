package com.job.controller;

import com.github.pagehelper.PageInfo;
import com.job.bean.Data;
import com.job.bean.ResultObject;
import com.job.service.DataService;
import com.job.util.Constant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 职位数据的控制器
 */
@RequestMapping("/job")
@RestController
public class DataController {

    /**
     * 注入职位数据接口实现类
     */
    @Autowired
    private DataService dataService;

    /**
     * 模糊查询
     */
    @RequestMapping("/getAllData") // 标识请求地址
    public ResultObject<List<Data>> getAllData(Data data, @RequestParam("limit") int limit, @RequestParam("page") int page) {
        // 1. 获取数据并分页
        PageInfo<Data> pageInfo = dataService.getAllData(data, limit, page);
        // 2. 统一返回
        ResultObject<List<Data>> rs = new ResultObject<List<Data>>();
        // 3. 返回获取到的数据
        List<Data> list = pageInfo.getList();
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("查询成功");
        rs.setData(list);
        rs.setCount(pageInfo.getTotal());
        return rs;
    }

    /**
     * 工作经验与薪水的关系
     */
    @RequestMapping("/getTask1") //标识请求地址
    public ResultObject<Object> getTask1() {
        // 1.统一返回
        ResultObject<Object> rs = new ResultObject<Object>();
        // 2.工作经验与薪水的关系
        List dataList = dataService.getTask1();
        // 3.返回获取到的数据
        rs.setData(dataList);
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("success");
        return rs;
    }


    /**
     * 各公司性质工资最好的TOP10城市
     */
    @RequestMapping("/getTask2") //标识请求地址
    public ResultObject<Object> getTask2() {
        // 1.统一返回
        ResultObject<Object> rs = new ResultObject<Object>();
        // 2.工作经验与薪水的关系
        List dataList = dataService.getTask2();
        // 3.返回获取到的数据
        rs.setData(dataList);
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("success");
        return rs;
    }

    /**
     * 学历与薪水的关系
     */
    @RequestMapping("/getTask3") //标识请求地址
    public ResultObject<Object> getTask3() {
        // 1.统一返回
        ResultObject<Object> rs = new ResultObject<Object>();
        // 2.薪水与发布职位数量关系占比分析
        List dataList = dataService.getTask3();
        // 3.返回获取到的数据
        rs.setData(dataList);
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("success");
        return rs;
    }

    /**
     * 各城市公司规模发布职位占比分析
     */
    @RequestMapping("/getTask4") //标识请求地址
    public ResultObject<Object> getTask4() {
        // 1.统一返回
        ResultObject<Object> rs = new ResultObject<Object>();
        // 2.各城市公司规模发布职位占比分析
        List dataList = dataService.getTask4();
        // 3.返回获取到的数据
        rs.setData(dataList);
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("success");
        return rs;
    }

    /**
     * 2020年1月-2020年6月，各城市招聘职位数量趋势图
     */
    @RequestMapping("/getTask5") //标识请求地址
    public ResultObject<Object> getTask5() {
        // 1.统一返回
        ResultObject<Object> rs = new ResultObject<Object>();
        // 2.各城市公司规模发布职位占比分析
        List dataList = dataService.getTask5();
        // 3.返回获取到的数据
        rs.setData(dataList);
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("success");
        return rs;
    }

    /**
     * 薪水与发布职位数量关系占比分析
     */
    @RequestMapping("/getTask6") //标识请求地址
    public ResultObject<Object> getTask6() {
        // 1.统一返回
        ResultObject<Object> rs = new ResultObject<Object>();
        // 2.薪水与发布职位数量关系占比分析
        List dataList = dataService.getTask6();
        // 3.返回获取到的数据
        rs.setData(dataList);
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("success");
        return rs;
    }

    /**
     * 各城市职位平均薪资涨幅变化趋势图
     */
    @RequestMapping("/getTask7") //标识请求地址
    public ResultObject<Object> getTask7(@RequestParam("job_city") String job_city) {
        // 1.统一返回
        ResultObject<Object> rs = new ResultObject<Object>();
        // 2.各城市职位平均薪资涨幅变化趋势图
        List dataList = dataService.getTask7(job_city);
        // 3.返回获取到的数据
        rs.setData(dataList);
        rs.setCode(Constant.SUCCESS_RETUEN_CODE);
        rs.setMsg("success");
        return rs;
    }

}
