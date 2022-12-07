package com.imnu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author HouJinTao
 * @since 2022-12-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="TOrder对象", description="")
public class TOrder implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "员会id")
    private Integer memberId;

    @ApiModelProperty(value = "约预日期")
    @TableField("orderDate")
    private Date orderdate;

    @ApiModelProperty(value = "约预类型 电话预约/微信预约")
    @TableField("orderType")
    private String ordertype;

    @ApiModelProperty(value = "预约状态（是否到诊）")
    @TableField("orderStatus")
    private String orderstatus;

    @ApiModelProperty(value = "餐套id")
    private Integer setmealId;


}
