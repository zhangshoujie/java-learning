package com.sjzhang.sm.service;

import com.sjzhang.sm.utils.ResultEntity;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Author 张守杰
 * @Date 2020/11/14
 **/
public interface AdminService {
    /**
     * 管理员登录
     *
     * @param account 账号
     * @param password : 密码
     * @return ResultEntity: 返回结果
     */
    ResultEntity adminLogin(String account, String password);
}
