package com.gqy.springbootstart.controller;

import com.gqy.springbootstart.dao.MethodNodeMapper;
import com.gqy.springbootstart.entity.MethodNode;
import com.gqy.springbootstart.entity.SysUser;
import com.gqy.springbootstart.entity.common.JSONResult;
import com.gqy.springbootstart.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("mybatis")
public class MyBatisCRUDController {
    @Autowired
    private UserService userService;
    @Autowired
    private MethodNodeMapper methodNodeMapper;
    @RequestMapping("/test")
    public JSONResult doStaticAnalysis2(String name, String appid) throws Exception {
        MethodNode n = new MethodNode();
        n.setId("1");
        MethodNode mnodes = methodNodeMapper.selectByPrimaryKey("1");
//        Example example = new Example(MethodNode.class);
//        Example.Criteria criteria = example.createCriteria();
//        criteria.andEqualTo("name", name)
//                .andEqualTo("appid", appid);
//        List<MethodNode> mnodes = methodNodeMapper.selectByExample(example);
        return JSONResult.ok(mnodes);
    }

    @RequestMapping("/saveUser")
    public JSONResult saveUser() throws Exception {

        String userId = "1";

        SysUser user = new SysUser();
        user.setId(userId);
        user.setUsername("imooc" + new Date());
        user.setNickname("imooc" + new Date());
        user.setPassword("abc123");
        user.setIsDelete(0);
        user.setRegistTime(new Date());

        userService.saveUser(user);

        return JSONResult.ok("保存成功");
    }

    @RequestMapping("/queryUserListPaged")
    public JSONResult queryUserListPaged(Integer page) {

        if (page == null) {
            page = 1;
        }

        int pageSize = 10;

        SysUser user = new SysUser();
//		user.setNickname("lee");

        List<SysUser> userList = userService.queryUserListPaged(user, page, pageSize);

        return JSONResult.ok(userList);
    }


}
