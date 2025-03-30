package com.wzj.fzdx.services;

import com.wzj.fzdx.pojo.Admin;
import com.wzj.fzdx.pojo.AdminQo;

import java.util.List;

/**
 * @program: fzdx250306
 * @description: AdminService
 * @author: WZJ
 * @create: 2025-03-06 11:17
 **/
public interface AdminService {
    /**
     * 管理员登录方法
     * @param name 账号
     * @param pwd 密码
     * @return admin 对象
     */
    Admin adminLogin(String name, String pwd);

    /**
     * 查询所有admin
     * @return List
     */
    List<Admin> getAllAdmin();

    /**
     * 添加admin
     * @param admin admin信息
     * @return 是否成功
     */
    Integer addAdmin(Admin admin);

    List<Admin> getAdminByAdminQo(AdminQo qo);
}
