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
 * sku图片
 * </p>
 *
 * @author shancm
 * @since 2020-06-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="PmsSkuImages对象", description="sku图片")
public class PmsSkuImages implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "sku_id")
    private Long skuId;

    @ApiModelProperty(value = "图片地址")
    private String imgUrl;

    @ApiModelProperty(value = "排序")
    private Integer imgSort;

    @ApiModelProperty(value = "默认图[0 - 不是默认图，1 - 是默认图]")
    private Integer defaultImg;


}
