package com.canjiren.dachuang.work.service.impl;

import com.canjiren.dachuang.work.entity.User;
import com.canjiren.dachuang.work.mapper.UserMapper;
import com.canjiren.dachuang.work.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author testjava
 * @since 2020-07-08
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    UserMapper userMapper;

    private double qian = 0.0;
    private double qian1 =0.0;
    @Override
    public List<User> seleteWithTree() {
        List<User> list = baseMapper.selectList(null);
//        找到所有的一级分类
        List<User> level1Menus = list.stream().filter(User ->
                User.getOnline() == null)
                .map((menu)->{
                    double money = selectMoney(menu.getId()).get(0).getMoney();
                    menu.setMoney(money);
                    qian = 0.0;
                    menu.setChildrens(getChildrens(menu,list));
                    qian+=menu.getMoney();
                    menu.setConMoney(qian-menu.getMoney());
                    System.out.println(qian-qian-menu.getMoney());
                    return menu;
                }).collect(Collectors.toList());
        qian = 0.0;
        return  level1Menus;
    }

    @Override
    public List<User> selectMoney(int id) {
       List<User> consume = userMapper.consume(id);
       List<User> produce = userMapper.produce(id);


       double con = consume.get(0).getMoney();
       double con1 = produce.get(0).getMoney();
       consume.get(0).setMoney(con-con1);


       return consume;
    }


    //递归查找所有菜单的子菜单
    private List<User> getChildrens(User root,List<User> all){
        List<User> children = all.stream().filter(User -> {
            return User.getOnline() == root.getId();
        }).map(User -> {

            double money = selectMoney(User.getId()).get(0).getMoney();
            User.setMoney(money);

            User.setChildrens(getChildrens(User,all));

            qian+=User.getMoney();
            User.setConMoney(qian-User.getMoney());
            System.out.println(qian-User.getMoney());

            return User;
        }).collect(Collectors.toList());

        return children;
    }
}
