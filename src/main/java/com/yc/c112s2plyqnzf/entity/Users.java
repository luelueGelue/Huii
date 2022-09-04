package com.yc.c112s2plyqnzf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 青鸟租房-用户表-1003
 * </p>
 *
 * @author yc
 * @since 2022-09-03
 */
@TableName("qnzf_users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 编号: 自增列
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 账号
     */
      private String username;

      /**
     * 密码
     */
      private String password;

      /**
     * 电话
     */
      private String phone;

      /**
     * 昵称
     */
      private String nickname;

      /**
     * 管理员: 1 管理员, 0 普通用户
     */
      private Boolean isadmin;

    
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
    
    public String getPhone() {
        return phone;
    }

      public void setPhone(String phone) {
          this.phone = phone;
      }
    
    public String getNickname() {
        return nickname;
    }

      public void setNickname(String nickname) {
          this.nickname = nickname;
      }
    
    public Boolean getIsadmin() {
        return isadmin;
    }

      public void setIsadmin(Boolean isadmin) {
          this.isadmin = isadmin;
      }

    @Override
    public String toString() {
        return "Users{" +
              "id=" + id +
                  ", username=" + username +
                  ", password=" + password +
                  ", phone=" + phone +
                  ", nickname=" + nickname +
                  ", isadmin=" + isadmin +
              "}";
    }
}
