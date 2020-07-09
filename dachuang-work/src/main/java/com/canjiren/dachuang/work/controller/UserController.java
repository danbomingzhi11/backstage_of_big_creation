package com.canjiren.dachuang.work.controller;


import com.canjiren.dachuang.common.utils.R;
import com.canjiren.dachuang.work.entity.User;
import com.canjiren.dachuang.work.mapper.UserMapper;
import com.canjiren.dachuang.work.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-07-08
 */
@RestController
@RequestMapping("/work/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserMapper userMapper;

    @GetMapping("11")
    public R hello_world (){
        List<User> list = userService.seleteWithTree();
        return R.ok().put("list",list);
    }
}

