package com.canjiren.dachuang.work.service;

import com.canjiren.dachuang.work.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author testjava
 * @since 2020-07-08
 */
@Mapper
public interface UserService extends IService<User> {
      List<User> seleteWithTree();
      List<User> selectMoney(int id);
}
