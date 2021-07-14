package cn.dotalk.usermanage.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * user_simple
 * @author 
 */
@Data
public class UserSimple implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private static final long serialVersionUID = 1L;
}