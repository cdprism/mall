package org.shancm.mallmember.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 会员收藏的商品
 * </p>
 *
 * @author shancm
 * @since 2020-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UmsMemberCollectSpu对象", description="会员收藏的商品")
public class UmsMemberCollectSpu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Long id;

    @ApiModelProperty(value = "会员id")
    private Long memberId;

    @ApiModelProperty(value = "spu_id")
    private Long spuId;

    @ApiModelProperty(value = "spu_name")
    private String spuName;

    @ApiModelProperty(value = "spu_img")
    private String spuImg;

    @ApiModelProperty(value = "create_time")
    private LocalDateTime createTime;


}
