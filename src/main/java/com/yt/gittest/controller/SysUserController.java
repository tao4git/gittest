package com.yt.gittest.controller;

import com.yt.gittest.common.util.Response;
import com.yt.gittest.domain.SysUser;
import com.yt.gittest.service.SysUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class SysUserController {


    @Resource
    private SysUserService sysUserService;


    @RequestMapping(name = "/queryUser")
    @ResponseBody
    public Object queryUser(@RequestBody SysUser sysUser){
        sysUserService.getUserById(sysUser);
        return Response.success();
    }

}
