package com.canjiren.dachuang.work.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.List;

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
 * @since 2020-07-08
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="User对象", description="")
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "自增主键")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "mingc")
    private String name;

    @ApiModelProperty(value = "上线")
    private Integer online;


    @ApiModelProperty(value = "孩子")
    @TableField(exist = false)
    private List<User> childrens;

    @ApiModelProperty(value = "钱")
    @TableField(exist = false)
    private Double money;

    @ApiModelProperty(value = "打钱")
    @TableField(exist = false)
    private Double conMoney;
}
