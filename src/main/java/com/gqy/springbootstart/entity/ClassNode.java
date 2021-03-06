package com.gqy.springbootstart.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;
import javax.persistence.*;

@Table(name = "CLASS_NODE")
public class ClassNode {
    /**
     * 类结点表id
     */
    @Id
    private String id;

    /**
     * 类名称
     */
    private String name;

    /**
     * 类结点键
     */
    private Integer key;

    /**
     * 项目id
     */
    @Column(name = "appId")
    private String appid;

    /**
     * 是否可用（0-不可用，1-可用）
     */
    private Integer flag;

    /**
     * 创建时间
     */
    @Column(name = "createdAt")
    private Date createdat;

    /**
     * 更新时间
     */
    @Column(name = "updatedAt")
    private Date updatedat;

    /**
     * 类型（0-类，1-接口）
     */
    private Integer type;

    /**
     * 获取类结点表id
     *
     * @return id - 类结点表id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置类结点表id
     *
     * @param id 类结点表id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取类名称
     *
     * @return name - 类名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置类名称
     *
     * @param name 类名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取类结点键
     *
     * @return key - 类结点键
     */
    public Integer getKey() {
        return key;
    }

    /**
     * 设置类结点键
     *
     * @param key 类结点键
     */
    public void setKey(Integer key) {
        this.key = key;
    }

    /**
     * 获取项目id
     *
     * @return appId - 项目id
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置项目id
     *
     * @param appid 项目id
     */
    public void setAppid(String appid) {
        this.appid = appid;
    }

    /**
     * 获取是否可用（0-不可用，1-可用）
     *
     * @return flag - 是否可用（0-不可用，1-可用）
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置是否可用（0-不可用，1-可用）
     *
     * @param flag 是否可用（0-不可用，1-可用）
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * 获取创建时间
     *
     * @return createdAt - 创建时间
     */
    public Date getCreatedat() {
        return createdat;
    }

    /**
     * 设置创建时间
     *
     * @param createdat 创建时间
     */
    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    /**
     * 获取更新时间
     *
     * @return updatedAt - 更新时间
     */
    public Date getUpdatedat() {
        return updatedat;
    }

    /**
     * 设置更新时间
     *
     * @param updatedat 更新时间
     */
    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
    }

    /**
     * 获取类型（0-类，1-接口）
     *
     * @return type - 类型（0-类，1-接口）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型（0-类，1-接口）
     *
     * @param type 类型（0-类，1-接口）
     */
    public void setType(Integer type) {
        this.type = type;
    }
}