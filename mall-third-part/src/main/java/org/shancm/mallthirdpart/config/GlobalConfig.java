package org.shancm.mallthirdpart.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Shancm
 * @date 2020/7/14
 */
@Configuration
public class GlobalConfig {

    @Value("accessId")
    String accessId;
    @Value("accessKey")
    String accessKey ;
    @Value("endpoint")
    String endpoint ;
    @Value("bucket")
    String bucket ;
    @Value("callbackUrl")
    String callbackUrl;

    @Bean
    public OSS OSSClient(){
        // 创建OSSClient实例。
        return new OSSClientBuilder().build(endpoint, accessId, accessKey);
    }


}
