package com.canjiren.dachuang.work.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author testjava
 * @since 2020-07-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="Account对象", description="")
public class Account implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "主键，身份证号（相当于储户银行卡号）")
    @TableId(value = "cardID", type = IdType.ID_WORKER_STR)
    private String cardID;

    @ApiModelProperty(value = "储户姓名")
    private String name;

    @ApiModelProperty(value = "储户密码")
    private String password;

    @ApiModelProperty(value = "储户余额")
    private Double balance;


}
