package org.shancm.mallware.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 采购信息
 * </p>
 *
 * @author shancm
 * @since 2020-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="WmsPurchase对象", description="采购信息")
public class WmsPurchase implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "采购单id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "采购人id")
    private Long assigneeId;

    @ApiModelProperty(value = "采购人名")
    private String assigneeName;

    @ApiModelProperty(value = "联系方式")
    private String phone;

    @ApiModelProperty(value = "优先级")
    private Integer priority;

    @ApiModelProperty(value = "状态")
    private Integer status;

    @ApiModelProperty(value = "仓库id")
    private Long wareId;

    @ApiModelProperty(value = "总金额")
    private BigDecimal amount;

    @ApiModelProperty(value = "创建日期")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "更新日期")
    private LocalDateTime updateTime;


}
