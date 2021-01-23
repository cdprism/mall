package org.shancm.mallproduct.service;

import org.shancm.mallproduct.entity.PmsCategory;
import com.baomidou.mybatisplus.extension.service.IService;
import org.shancm.mallproduct.entity.req.PmsCategoryReq;
import org.shancm.mallproduct.entity.res.PmsCategoryRes;

import java.util.List;

/**
 * <p>
 * 商品三级分类 服务类
 * </p>
 *
 * @author shancm
 * @since 2020-06-24
 */
public interface IPmsCategoryService extends IService<PmsCategory> {

    List<PmsCategoryRes> categoryTree();

    void append(PmsCategoryReq req);

    void logicDelete(long id);

}
