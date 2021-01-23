package org.shancm.mallware.entity;

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
 * 
 * </p>
 *
 * @author shancm
 * @since 2020-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="WmsPurchaseDetail对象", description="")
public class WmsPurchaseDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "采购单id")
    private Long purchaseId;

    @ApiModelProperty(value = "采购商品id")
    private Long skuId;

    @ApiModelProperty(value = "采购数量")
    private Integer skuNum;

    @ApiModelProperty(value = "采购金额")
    private BigDecimal skuPrice;

    @ApiModelProperty(value = "仓库id")
    private Long wareId;

    @ApiModelProperty(value = "状态[0新建，1已分配，2正在采购，3已完成，4采购失败]")
    private Integer status;


}
