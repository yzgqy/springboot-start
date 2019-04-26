package com.gqy.springbootstart.service.impl;

import com.github.pagehelper.PageHelper;
import com.gqy.springbootstart.dao.SysUserMapper;
import com.gqy.springbootstart.entity.SysUser;
import com.gqy.springbootstart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
//import org.thymeleaf.util.StringUtils;

import java.lang.annotation.Annotation;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public void saveUser(SysUser user) throws Exception {
        sysUserMapper.insert(user);
    }

    @Override
    public void updateUser(SysUser user) {
        sysUserMapper.updateByPrimaryKey(user);
    }

    @Override
    public void deleteUser(String userId) {
//        sysUserMapper.

    }

    @Override
    public SysUser queryUserById(String userId) {
        return null;
    }

    @Override
    public List<SysUser> queryUserList(SysUser user) {
        return null;
    }

    @Override
    public List<SysUser> queryUserListPaged(SysUser user, Integer page, Integer pageSize) {
        // 开始分页
        PageHelper.startPage(page, pageSize);

        Example example = new Example(SysUser.class);
        Example.Criteria criteria = example.createCriteria();

//        if (!StringUtils.isEmptyOrWhitespace(user.getNickname())) {
            criteria.andLike("nickname", "%" + user.getNickname() + "%");
//        }
        example.orderBy("registTime").desc();
        List<SysUser> userList = sysUserMapper.selectByExample(example);

        return userList;
    }

    @Override
    public SysUser queryUserByIdCustom(String userId) {
        return null;
    }

    @Override
    public void saveUserTransactional(SysUser user) {

    }
}
