package com.wzj.fzdx.dto;


import lombok.Data;

import java.util.HashMap;
import java.util.Map;

// 信息传递封装类
@Data
public class JsonDto {
    private Integer id; // 判断是否成功；1：成功，0：失败
    private String message; // 回传消息
    private String location; // 下一步跳转的页面地址
    private Map<String, Object> data = new HashMap<>(); // 返回的数据
}
