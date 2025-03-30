package com.wzj.fzdx.control;


import com.wzj.fzdx.dto.JsonDto;
import com.wzj.fzdx.pojo.Admin;
import com.wzj.fzdx.pojo.AdminQo;
import com.wzj.fzdx.services.AdminService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

// @RestController: 帮助 new 对象， 避免资源重复
// 让spring来管理对象，不需要自己进行实例化操作
// 利用静态工厂的思想（在内存保证只有一个AdminControl对象）
// JsonDto jsonDto = new JsonDto();

@RestController
public class AdminControl {
    @Resource
    AdminService adminService;

    /*
    * request：传递的各种数据
    * session：会话管理
    * */
    @GetMapping("/adminLogin") // 请求路径配置 路径是/adminLogin
    public JsonDto login(HttpServletRequest request, HttpSession session){

        // 从请求request中获取账号密码信息
        String name = request.getParameter("name");
        String pwd = request.getParameter("pwd");
        name = "admin";
        pwd = "123456";

        JsonDto jsonDto = new JsonDto(); // 注解RestController自动分配 // 传输类
        Admin admin = adminService.adminLogin(name, pwd);
        if (admin!=null){
            jsonDto.setId(1);
            jsonDto.getData().put("admin", admin); // 把admin传回到页面查看
            jsonDto.setMessage("登录成功了！");
        } else {
            jsonDto.setId(0);
            jsonDto.setMessage("登录失败~~~~~");
        }
        return jsonDto;
    }

    // post请求参数不能暴露在url
    // get请求参数可以暴露
    @PostMapping("/getAllAdmin")
    public JsonDto getAllAdmin(HttpServletRequest request){
        JsonDto jsonDto = new JsonDto();
        try{
            List<Admin> allAdmin = adminService.getAllAdmin();
            jsonDto.getData().put("adminList", allAdmin);
        } catch(Exception e){
            e.printStackTrace();
        }

        return jsonDto;
    }

    @PostMapping("/addAdmin")
    public JsonDto addAdmin(HttpServletRequest request, Admin admin){
        JsonDto jsonDto = new JsonDto();
        //        mock data
//        Admin admin = new Admin();
//        admin.setAdminUsername("laowang");
//        admin.setAdminPassword("666666");

        Integer i = adminService.addAdmin(admin);
        if (i > 0){
            jsonDto.setId(1);
            jsonDto.setMessage("添加成功");
        }

        return jsonDto;
    }

    @PostMapping("/findAdmin")
    public JsonDto getAllAdminByCondition(HttpServletRequest request, AdminQo qo){
        JsonDto jsonDto = new JsonDto();

        try{
            List<Admin> admins = adminService.getAdminByAdminQo(qo);
            jsonDto.getData().put("adminList", admins);
        } catch(Exception e){
            e.printStackTrace();
        }

        return jsonDto;
    }
}

