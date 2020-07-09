package com.canjiren.dachuang.work.mapper;

import com.canjiren.dachuang.work.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author testjava
 * @since 2020-07-08
 */
@Component
public interface UserMapper extends BaseMapper<User> {
    List<User> consume(int id);
    List<User>  produce(int id);
}
