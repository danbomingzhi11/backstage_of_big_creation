package com.canjiren.dachuang.work.controller;


import com.canjiren.dachuang.common.exception.BizCodeEnume;
import com.canjiren.dachuang.common.utils.R;
import com.canjiren.dachuang.work.entity.Account;
import com.canjiren.dachuang.work.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author testjava
 * @since 2020-07-07
 */
@RestController
@RequestMapping("/work/account")
public class AccountController {

    @Autowired
    AccountMapper accountMapper;

    @GetMapping("11")
    public R hello(){
        accountMapper.selectById(12);
        List<Account> list = new ArrayList<>();
        Map<String,Object> map = new HashMap<>();
        map.put("我是key", list);
        return R.ok(map);
    }
}

