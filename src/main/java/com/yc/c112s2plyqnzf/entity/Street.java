package com.yc.c112s2plyqnzf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 青鸟租房-街道表-1003
 * </p>
 *
 * @author yc
 * @since 2022-09-03
 */
@TableName("qnzf_street")
public class Street implements Serializable {

    private static final long serialVersionUID = 1L;

      /**
     * 编号: 自增列
     */
        @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 街道名
     */
      private String name;

      /**
     * 地区编号: 关联 qnzf_district.id
     */
      private Integer did;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public String getName() {
        return name;
    }

      public void setName(String name) {
          this.name = name;
      }
    
    public Integer getDid() {
        return did;
    }

      public void setDid(Integer did) {
          this.did = did;
      }

    @Override
    public String toString() {
        return "Street{" +
              "id=" + id +
                  ", name=" + name +
                  ", did=" + did +
              "}";
    }
}
