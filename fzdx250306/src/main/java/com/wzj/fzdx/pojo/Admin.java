package com.wzj.fzdx.pojo;

import lombok.Data;

@Data
public class Admin {
    private Integer adminId;
    private String adminUsername;
    private String adminPassword;
    private Integer adminState;
}
