package com.ssm.boot.controller;

import com.ssm.boot.entity.User;
import com.ssm.boot.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Carrey on 2018/8/24.
 */
@Api(description = "User相关接口")
@RestController
@RequestMapping("ssm")
public class UserController {


    @Autowired
    private UserService userService;

    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "主键id",dataType = "String" ,paramType = "query"),
            @ApiImplicitParam(name = "userName",value = "姓名",dataType = "String" ,paramType = "query"),
    })
    @PostMapping("insert")
    public String insert(@RequestParam(required = false) String id,
                         @RequestParam(required = false)String userName){
        userService.insert(id,userName);
        return "insert success";
    }

    @PostMapping("delete")
    public String delete(String id){
        userService.delete(id);
        return "delete success";
    }


    @PostMapping("queryUser")
    public User queryUser(String id){
        User user = userService.queryUser(id);
        return user;
    }

    @PostMapping("queryUserList")
    public List<User> queryUserList(){
        List<User> user = userService.queryUserList();
        return user;
    }
}
