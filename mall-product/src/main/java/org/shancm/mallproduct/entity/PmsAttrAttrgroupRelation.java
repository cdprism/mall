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
 * 属性&属性分组关联
 * </p>
 *
 * @author shancm
 * @since 2020-06-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PmsAttrAttrgroupRelation对象", description="属性&属性分组关联")
public class PmsAttrAttrgroupRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "属性id")
    private Long attrId;

    @ApiModelProperty(value = "属性分组id")
    private Long attrGroupId;

    @ApiModelProperty(value = "属性组内排序")
    private Integer attrSort;


}
