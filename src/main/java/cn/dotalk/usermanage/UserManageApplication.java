package cn.dotalk.usermanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class UserManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserManageApplication.class, args);
    }

}
