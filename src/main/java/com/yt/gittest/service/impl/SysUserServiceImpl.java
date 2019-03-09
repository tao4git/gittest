package com.yt.gittest.service.impl;

import com.yt.gittest.dao.SysUserDao;
import com.yt.gittest.domain.SysUser;
import com.yt.gittest.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "sysUserService")
public class SysUserServiceImpl implements SysUserService {



    @Resource
    SysUserDao sysUserDao;

    @Override
    public SysUser getUserById(SysUser sysUser) {
        return sysUserDao.getUserById(sysUser);
    }

    @Override
    public Long insertUser(SysUser sysUser) {
        return sysUserDao.insertUser(sysUser);
    }

    @Override
    public Long updateUser(SysUser sysUser) {
        return sysUserDao.updateUser(sysUser);
    }
}
