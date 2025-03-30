package com.wzj.fzdx.mapper;

import com.wzj.fzdx.pojo.AdminQo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.wzj.fzdx.pojo.Admin;

import java.util.List;

/**
 * @program: fzdx250306
 * @description: AdminMapper
 * @author: WZJ
 * @create: 2025-03-13 08:32
 **/


public interface AdminMapper {

    /**
     * 用户的登录查询
     * @param name 用户名
     * @param pwd 密码
     * @return Admin对象
     */

//    定义别名参数
//    使用@Param("")实现参数化查询

//    xml方式映射
    Admin selectByNameAndPwd(@Param("name") String name, @Param("p") String pwd);
    List<Admin> selectAllAdmin();
//    @Select注释映射
    @Select("select * from admin where admin_username = #{name}")
    Admin selectByName(@Param("name") String name);

    /**
     * 插入admin
     * @param admin 用户对象
     * @return 影响的行数
     */
    Integer insertByAdmin(@Param("a") Admin admin);

    List<Admin> selectAdminByCondition(@Param("qo") AdminQo adminQo);
}








