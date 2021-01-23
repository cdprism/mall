package org.shancm.mallproduct;

import org.junit.jupiter.api.Test;
import org.shancm.mallproduct.entity.PmsBrand;
import org.shancm.mallproduct.service.IPmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallProductApplicationTests {

    @Autowired
    private IPmsBrandService pmsBrandService;


    @Test
    void contextLoads() {
        PmsBrand brand = new PmsBrand();
        brand.setName("honda");
        pmsBrandService.save(brand);
    }

}
