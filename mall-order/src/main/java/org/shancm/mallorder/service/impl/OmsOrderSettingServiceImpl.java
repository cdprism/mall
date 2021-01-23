package org.shancm.mallorder.service.impl;

import org.shancm.mallorder.entity.OmsOrderSetting;
import org.shancm.mallorder.mapper.OmsOrderSettingMapper;
import org.shancm.mallorder.service.IOmsOrderSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单配置信息 服务实现类
 * </p>
 *
 * @author shancm
 * @since 2020-06-24
 */
@Service
public class OmsOrderSettingServiceImpl extends ServiceImpl<OmsOrderSettingMapper, OmsOrderSetting> implements IOmsOrderSettingService {

}
