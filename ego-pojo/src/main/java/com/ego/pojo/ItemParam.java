package com.ego.pojo;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 商品规则参数
 * </p>
 *
 * @author Midya
 * @since 2020-02-25
 */
@TableName("tb_item_param")
public class ItemParam extends Model<ItemParam> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 商品类目ID
     */
    private Long itemCatId;
    /**
     * 参数数据，格式为json格式
     */
    private String paramData;
    private Date created;
    private Date updated;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemCatId() {
        return itemCatId;
    }

    public void setItemCatId(Long itemCatId) {
        this.itemCatId = itemCatId;
    }

    public String getParamData() {
        return paramData;
    }

    public void setParamData(String paramData) {
        this.paramData = paramData;
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
        return this.id;
    }

    @Override
    public String toString() {
        return "ItemParam{" +
        ", id=" + id +
        ", itemCatId=" + itemCatId +
        ", paramData=" + paramData +
        ", created=" + created +
        ", updated=" + updated +
        "}";
    }
}
