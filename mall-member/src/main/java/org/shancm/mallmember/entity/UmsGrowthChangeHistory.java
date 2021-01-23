package org.shancm.mallmember.entity;

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
 * 成长值变化历史记录
 * </p>
 *
 * @author shancm
 * @since 2020-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UmsGrowthChangeHistory对象", description="成长值变化历史记录")
public class UmsGrowthChangeHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "member_id")
    private Long memberId;

    @ApiModelProperty(value = "create_time")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "改变的值（正负计数）")
    private Integer changeCount;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "积分来源[0-购物，1-管理员修改]")
    private Integer sourceType;


}
