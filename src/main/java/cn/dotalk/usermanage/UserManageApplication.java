package cn.dotalk.usermanage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

// 忽略数据库连接
//@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})

@MapperScan("cn.dotalk.usermanage.mapper")
@SpringBootApplication()
public class UserManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserManageApplication.class, args);
    }

}
