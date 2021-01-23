package org.shancm.mallproduct.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * spu属性值
 * </p>
 *
 * @author shancm
 * @since 2020-06-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PmsProductAttrValue对象", description="spu属性值")
public class PmsProductAttrValue implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "商品id")
    private Long spuId;

    @ApiModelProperty(value = "属性id")
    private Long attrId;

    @ApiModelProperty(value = "属性名")
    private String attrName;

    @ApiModelProperty(value = "属性值")
    private String attrValue;

    @ApiModelProperty(value = "顺序")
    private Integer attrSort;

    @ApiModelProperty(value = "快速展示【是否展示在介绍上；0-否 1-是】")
    private Integer quickShow;


}
