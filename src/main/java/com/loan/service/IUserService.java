package com.loan.service;

import com.loan.bean.TUser;

/**
 * 用户服务接口
 */
public interface IUserService {

    /**
     * 用户登录
     */
    TUser login(TUser user);

    /**
     * 用户注册
     */
    Integer reg(TUser user);

}
