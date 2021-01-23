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
 * 会员登录记录
 * </p>
 *
 * @author shancm
 * @since 2020-07-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="UmsMemberLoginLog对象", description="会员登录记录")
public class UmsMemberLoginLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "member_id")
    private Long memberId;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "ip")
    private String ip;

    @ApiModelProperty(value = "city")
    private String city;

    @ApiModelProperty(value = "登录类型[1-web，2-app]")
    private Boolean loginType;


}
