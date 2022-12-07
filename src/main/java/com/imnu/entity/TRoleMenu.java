package com.imnu.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
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
@ApiModel(value="TRoleMenu对象", description="")
public class TRoleMenu implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "role_id", type = IdType.ID_WORKER_STR)
    private Integer roleId;

    private Integer menuId;


}
