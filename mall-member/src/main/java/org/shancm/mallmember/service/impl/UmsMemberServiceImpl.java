package org.shancm.mallmember.service.impl;

import org.shancm.mallmember.entity.UmsMember;
import org.shancm.mallmember.mapper.UmsMemberMapper;
import org.shancm.mallmember.service.IUmsMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员 服务实现类
 * </p>
 *
 * @author shancm
 * @since 2020-07-01
 */
@Service
public class UmsMemberServiceImpl extends ServiceImpl<UmsMemberMapper, UmsMember> implements IUmsMemberService {

}
