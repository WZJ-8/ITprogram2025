package com.wzj.fzdx.services.impl;

import com.wzj.fzdx.mapper.AdminMapper;
import com.wzj.fzdx.pojo.Admin;
import com.wzj.fzdx.pojo.AdminQo;
import com.wzj.fzdx.services.AdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: fzdx250306
 * @description: AdminServiceImplement
 * @author: WZJ
 * @create: 2025-03-06 11:20
 **/

@Service
public class AdminServiceImpl implements AdminService {

    @Resource
    AdminMapper adminMapper;

    @Override
    public Admin adminLogin(String name, String pwd) {
        System.out.println("adminLogin............");

//        Admin admin = adminMapper.selectByNameAndPwd(name, pwd);
        Admin admin1 = adminMapper.selectByName(name);

        return admin1;
    }

    @Override
    public List<Admin> getAllAdmin() {
        List<Admin> admins = adminMapper.selectAllAdmin();
        return admins;
    }

    @Override
    public Integer addAdmin(Admin admin){
        Integer ret = adminMapper.insertByAdmin(admin);
        return ret;
    }

    @Override
    public List<Admin> getAdminByAdminQo(AdminQo qo) {
        List<Admin> admins = adminMapper.selectAdminByCondition(qo);
        return admins;
    }
}
