package org.shancm.mallproduct.controller;


import org.shancm.common.entity.CommonResponse;
import org.shancm.mallproduct.entity.req.PmsCategoryReq;
import org.shancm.mallproduct.entity.res.PmsCategoryRes;
import org.shancm.mallproduct.service.IPmsCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 商品三级分类 前端控制器
 * </p>
 *
 * @author shancm
 * @since 2020-06-24
 */
@RestController
@RequestMapping("/pms-category")
public class PmsCategoryController {

    private final IPmsCategoryService categoryService;

    @Autowired
    public PmsCategoryController(IPmsCategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/tree")
    public CommonResponse<List<PmsCategoryRes>> categoryTree() {
        List<PmsCategoryRes> res = categoryService.categoryTree();
        return CommonResponse.success(res);
    }

    @PostMapping("/append")
    public CommonResponse<?> append(@RequestBody PmsCategoryReq req) {
        System.out.println("PmsCategoryReq "+req);
        categoryService.append(req);
        return CommonResponse.success();
    }

//    @PostMapping("/delete")
//    public CommonResponse<?> logicDelete(Long[] ids) {
//        System.out.println("ids "+ids);
//        categoryService.logicDelete(Arrays.asList(ids));
//        return CommonResponse.success();
//    }

    @PostMapping("/delete")
    public CommonResponse<?> logicDelete(@RequestBody Long id) {
        System.out.println("id "+id);
        categoryService.logicDelete(id);
        return CommonResponse.success();
    }


}
