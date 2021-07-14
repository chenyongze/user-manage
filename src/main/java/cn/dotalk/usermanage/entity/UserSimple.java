package cn.dotalk.usermanage.entity;

import java.io.Serializable;

/**
 * user_simple
 * @author 
 */
public class UserSimple implements Serializable {
    private Integer id;

    private String username;

    private String password;

    private String realname;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }
}