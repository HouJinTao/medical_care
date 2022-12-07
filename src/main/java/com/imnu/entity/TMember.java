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
@ApiModel(value="TMember对象", description="")
public class TMember implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("fileNumber")
    private String filenumber;

    private String name;

    private String sex;

    @TableField("idCard")
    private String idcard;

    @TableField("phoneNumber")
    private String phonenumber;

    @TableField("regTime")
    private Date regtime;

    private String password;

    private String email;

    private Date birthday;

    private String remark;


}
