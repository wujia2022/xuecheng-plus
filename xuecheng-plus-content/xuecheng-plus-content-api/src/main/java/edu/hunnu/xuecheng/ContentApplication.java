package edu.hunnu.xuecheng;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * ClassName: ContentApplication
 * Package: edu.hunnu.xuecheng
 * Description:
 *
 * @Author: 吴佳
 * @Create: 2024/5/23 - 14:37
 * @Version: v1.0
 */
@SpringBootApplication
@EnableSwagger2Doc
public class ContentApplication {

    public static void main(String[] args) {
        SpringApplication.run(ContentApplication.class,args);
    }
}
