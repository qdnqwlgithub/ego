package com.ego.pojo;

import com.baomidou.mybatisplus.enums.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 商品类目
 * </p>
 *
 * @author Midya
 * @since 2020-02-25
 */
@TableName("tb_item_cat")
public class ItemCat extends Model<ItemCat> {

    private static final long serialVersionUID = 1L;

    /**
     * 类目ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    /**
     * 父类目ID=0时，代表的是一级的类目
     */
    private Long parentId;
    /**
     * 类目名称
     */
    private String name;
    /**
     * 状态。可选值:1(正常),2(删除)
     */
    private Integer status;
    /**
     * 排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数
     */
    private Integer sortOrder;
    /**
     * 该类目是否为父类目，1为true，0为false
     */
    private Integer isParent;
    /**
     * 创建时间
     */
    private Date created;
    /**
     * 创建时间
     */
    private Date updated;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Integer getIsParent() {
        return isParent;
    }

    public void setIsParent(Integer isParent) {
        this.isParent = isParent;
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
        return "ItemCat{" +
        ", id=" + id +
        ", parentId=" + parentId +
        ", name=" + name +
        ", status=" + status +
        ", sortOrder=" + sortOrder +
        ", isParent=" + isParent +
        ", created=" + created +
        ", updated=" + updated +
        "}";
    }
}
