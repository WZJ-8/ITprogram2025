package com.wzj.fzdx.pojo;

import lombok.Data;

/**
 * @program: fzdx250306
 * @description: AdminQo
 * @author: WZJ
 * @create: 2025-03-20 10:39
 **/
@Data
public class AdminQo {
    private String adminUsername;
    private Integer adminState;

    // 分页
    private Integer start;
    private Integer limit;

}
