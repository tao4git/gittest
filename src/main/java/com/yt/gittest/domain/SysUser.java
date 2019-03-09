package com.yt.gittest.domain;


import lombok.Data;

import java.util.Date;

@Data
public class SysUser {

    private Long id;
    private String userName;
    private String userPwd;
    private String status;
    private String userId;
    private Date createTime;
    private Date updateTime;
}
