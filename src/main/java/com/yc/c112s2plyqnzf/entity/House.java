package com.yc.c112s2plyqnzf.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 * 青鸟租房-房屋表-2
 * </p>
 *
 * @author yc
 * @since 2022-09-03
 */
@TableName("qnzf_house")
public class House implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
      private Integer id;

      /**
     * 发布人: 关联 qnzf_users.id
     */
      private Integer uid;

      /**
     * 类别编号: 关联 qnzf_type.id
     */
      private Integer tid;

      /**
     * 街道编号: 关联 qnzf_street.id
     */
      private Integer sid;

      /**
     * 标题
     */
      private String title;

      /**
     * 介绍
     */
      private String intro;

      /**
     * 价格
     */
      private Integer price;

      /**
     * 发布日期
     */
      private LocalDate pubdate;

      /**
     * 房屋面积
     */
      private Integer floorage;

      /**
     * 联系方式
     */
      private String contact;

      /**
     * 图片: 图片地址
     */
      private String imgs;

    
    public Integer getId() {
        return id;
    }

      public void setId(Integer id) {
          this.id = id;
      }
    
    public Integer getUid() {
        return uid;
    }

      public void setUid(Integer uid) {
          this.uid = uid;
      }
    
    public Integer getTid() {
        return tid;
    }

      public void setTid(Integer tid) {
          this.tid = tid;
      }
    
    public Integer getSid() {
        return sid;
    }

      public void setSid(Integer sid) {
          this.sid = sid;
      }
    
    public String getTitle() {
        return title;
    }

      public void setTitle(String title) {
          this.title = title;
      }
    
    public String getIntro() {
        return intro;
    }

      public void setIntro(String intro) {
          this.intro = intro;
      }
    
    public Integer getPrice() {
        return price;
    }

      public void setPrice(Integer price) {
          this.price = price;
      }
    
    public LocalDate getPubdate() {
        return pubdate;
    }

      public void setPubdate(LocalDate pubdate) {
          this.pubdate = pubdate;
      }
    
    public Integer getFloorage() {
        return floorage;
    }

      public void setFloorage(Integer floorage) {
          this.floorage = floorage;
      }
    
    public String getContact() {
        return contact;
    }

      public void setContact(String contact) {
          this.contact = contact;
      }
    
    public String getImgs() {
        return imgs;
    }

      public void setImgs(String imgs) {
          this.imgs = imgs;
      }

    @Override
    public String toString() {
        return "House{" +
              "id=" + id +
                  ", uid=" + uid +
                  ", tid=" + tid +
                  ", sid=" + sid +
                  ", title=" + title +
                  ", intro=" + intro +
                  ", price=" + price +
                  ", pubdate=" + pubdate +
                  ", floorage=" + floorage +
                  ", contact=" + contact +
                  ", imgs=" + imgs +
              "}";
    }
}
