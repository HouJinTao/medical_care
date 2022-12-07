package com.imnu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
@ApiModel(value="TCheckgroup对象", description="")
public class TCheckgroup implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String code;

    private String name;

    @TableField("helpCode")
    private String helpcode;

    private String sex;

    private String remark;

    private String attention;


}
