package com.job.service.impl;
import com.github.pagehelper.PageHelper;

import com.github.pagehelper.PageInfo;
import com.job.bean.Data;
import com.job.mapper.DataMapper;
import com.job.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;


/**
 * 职位数据接口实现类
 */
@Service //标识为服务类
public class DataImpl implements DataService {

    /**
     * 注入成绩数据dao层接口
     */
    @Autowired
    private DataMapper dataMapper;


    @Override
    public PageInfo<Data> getAllData(Data data, int limit, int page) {
        PageHelper.startPage(page, limit);
        Example example = new Example(data.getClass());
        Example.Criteria criteria = example.createCriteria();

        if (data.getAge() != null) {
            criteria.andEqualTo("age", data.getAge());
        }
        if (data.getIncome() != null) {
            criteria.andEqualTo("income", data.getIncome());
        }
        if (data.getLoan_amount() != null) {
            criteria.andEqualTo("loan_amount", data.getLoan_amount());
        }
        if (data.getCredit_score() != null) {
            criteria.andLike("credit_score", "%" + data.getCredit_score() + "%");
        }
        if (data.getMonths_employed() != null) {
            criteria.andEqualTo("months_employed", data.getMonths_employed());
        }
        if (data.getNum_credit_lines() != null) {
            criteria.andEqualTo("num_credit_lines", data.getNum_credit_lines());
        }
        if (data.getInterest_rate() != null) {
            criteria.andEqualTo("interest_rate", data.getInterest_rate());
        }
        if (data.getLoan_term() != null) {
            criteria.andEqualTo("loan_term", data.getLoan_term());
        }
        if (data.getD_t_i_ratio() != null) {
            criteria.andEqualTo("d_t_i_ratio", data.getD_t_i_ratio());
        }
        if (data.getEducation() != null) {
            criteria.andEqualTo("education", data.getEducation());
        }
        if (data.getEmployment_type() != null) {
            criteria.andEqualTo("employment_type", data.getEmployment_type());
        }
        if (data.getMarital_status() != null) {
            criteria.andEqualTo("marital_status", data.getMarital_status());
        }
        if (data.getHas_mortgage() != null) {
            criteria.andEqualTo("has_mortgage", data.getHas_mortgage());
        }
        if (data.getHas_dependents() != null) {
            criteria.andEqualTo("has_dependents", data.getHas_dependents());
        }
        if (data.getHas_co_signer() != null) {
            criteria.andEqualTo("has_co_signer", data.getHas_co_signer());
        }

        example.setOrderByClause("id asc");
        List<Data> list = dataMapper.selectByExample(example);
        PageInfo<Data> pageInfo = new PageInfo<Data>(list);
        return pageInfo;
    }


    @Override
    public List getTask1() {
        return null;
    }

    @Override
    public List getTask2() {
        return dataMapper.getTask2();
    }

    @Override
    public List getTask3() {
        return dataMapper.getTask3();
    }

    @Override
    public List getTask4() {
        return dataMapper.getTask4();
    }

    @Override
    public List getTask5() {
        return dataMapper.getTask5();
    }

    @Override
    public List getTask6() {
        return dataMapper.getTask6();
    }

    @Override
    public List<Integer> getTask7(String job_city) {
        return null;
    }

}
