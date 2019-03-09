package com.yt.gittest.dao;

import com.yt.gittest.domain.SysUser;

public interface SysUserDao {

    public SysUser getUserById(SysUser sysUser);

    public Long insertUser(SysUser sysUser);

    public Long updateUser(SysUser sysUser);
}
