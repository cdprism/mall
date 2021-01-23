package org.shancm.mallorder.service.impl;

import org.shancm.mallorder.entity.OmsOrder;
import org.shancm.mallorder.mapper.OmsOrderMapper;
import org.shancm.mallorder.service.IOmsOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author shancm
 * @since 2020-06-24
 */
@Service
public class OmsOrderServiceImpl extends ServiceImpl<OmsOrderMapper, OmsOrder> implements IOmsOrderService {

}
