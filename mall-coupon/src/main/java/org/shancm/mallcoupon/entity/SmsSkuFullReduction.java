package org.shancm.mallcoupon.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 商品满减信息
 * </p>
 *
 * @author shancm
 * @since 2020-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="SmsSkuFullReduction对象", description="商品满减信息")
public class SmsSkuFullReduction implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "spu_id")
    private Long skuId;

    @ApiModelProperty(value = "满多少")
    private BigDecimal fullPrice;

    @ApiModelProperty(value = "减多少")
    private BigDecimal reducePrice;

    @ApiModelProperty(value = "是否参与其他优惠")
    private Boolean addOther;


}
