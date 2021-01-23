package org.shancm.mallproduct.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.shancm.common.util.JsonUtil;
import org.shancm.mallproduct.entity.PmsCategory;
import org.shancm.mallproduct.entity.req.PmsCategoryReq;
import org.shancm.mallproduct.entity.res.PmsCategoryRes;
import org.shancm.mallproduct.mapper.PmsCategoryMapper;
import org.shancm.mallproduct.service.IPmsCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <p>
 * 商品三级分类 服务实现类
 * </p>
 *
 * @author shancm
 * @since 2020-06-24
 */
@Service
public class PmsCategoryServiceImpl extends ServiceImpl<PmsCategoryMapper, PmsCategory> implements IPmsCategoryService {

    private static final Integer SHOW = 1;
    private static final Integer LEVEL_ONE = 1;
    private static final Integer LEVEL_TWO = 2;
    private static final Integer LEVEL_THREE = 3;

    @Override
    public List<PmsCategoryRes> categoryTree() {
//        List<PmsCategoryRes> res;
        LambdaQueryWrapper<PmsCategory> condition = condition();
        List<PmsCategory> list = this.list(condition);
        List<PmsCategoryRes> listOne = filterLevel(list, LEVEL_ONE);
        List<PmsCategoryRes> listTwo = filterLevel(list, LEVEL_TWO);
        List<PmsCategoryRes> listThree = filterLevel(list, LEVEL_THREE);
        attachChildren(listTwo, listThree);
        attachChildren(listOne, listTwo);
        return listOne;
    }

    @Override
    public void append(PmsCategoryReq req) {
        PmsCategory category = JsonUtil.convert(req, PmsCategory.class);
        this.save(category);
    }

    @Override
    public void logicDelete(long id) {
        this.removeById(id);
    }

    private List<PmsCategoryRes> filterLevel(List<PmsCategory> list, int level) {
        return list.stream()
                .filter(n -> Objects.equals(n.getCatLevel(), level))
                .map(n -> JsonUtil.convert(n, PmsCategoryRes.class))
                .collect(Collectors.toList());
    }

    private void attachChildren(List<PmsCategoryRes> father, List<PmsCategoryRes> children) {
        for (PmsCategoryRes n : father) {
            children.stream().filter(e -> Objects.equals(e.getParentCid(), n.getCatId()))
                    .forEach(e -> n.getChildren().add(e));
        }
    }


    private LambdaQueryWrapper<PmsCategory> condition() {
        LambdaQueryWrapper<PmsCategory> wrapper = new QueryWrapper<PmsCategory>().lambda();
        wrapper.eq(PmsCategory::getShowStatus, SHOW);
        return wrapper;
    }
}
