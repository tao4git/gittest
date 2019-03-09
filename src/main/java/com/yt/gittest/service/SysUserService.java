package com.yt.gittest.service;

import com.yt.gittest.domain.SysUser;

public interface SysUserService {

    public SysUser getUserById(SysUser sysUser);

    public Long insertUser(SysUser sysUser);

    public Long updateUser(SysUser sysUser);
}
