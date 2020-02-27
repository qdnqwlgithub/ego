package com.ego.pojo;

import java.util.Date;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 商品描述表
 * </p>
 *
 * @author Midya
 * @since 2020-02-25
 */
@TableName("tb_item_desc")
public class ItemDesc extends Model<ItemDesc> {

    private static final long serialVersionUID = 1L;

    /**
     * 商品ID
     */
    @TableId(value = "item_id")
    private Long itemId;
    /**
     * 商品描述
     */
    private String itemDesc;
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 更新时间
     */
    private Date updated;


    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    @Override
    protected Serializable pkVal() {
        return this.itemId;
    }

    @Override
    public String toString() {
        return "ItemDesc{" +
        ", itemId=" + itemId +
        ", itemDesc=" + itemDesc +
        ", created=" + created +
        ", updated=" + updated +
        "}";
    }
}
