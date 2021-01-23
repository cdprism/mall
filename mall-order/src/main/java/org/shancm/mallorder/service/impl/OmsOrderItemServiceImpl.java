package org.shancm.mallorder.service.impl;

import org.shancm.mallorder.entity.OmsOrderItem;
import org.shancm.mallorder.mapper.OmsOrderItemMapper;
import org.shancm.mallorder.service.IOmsOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单项信息 服务实现类
 * </p>
 *
 * @author shancm
 * @since 2020-06-24
 */
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements IOmsOrderItemService {

}
