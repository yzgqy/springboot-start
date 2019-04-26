package com.gqy.springbootstart.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;
import javax.persistence.*;

public class Algorithms {
    /**
     * 算法表id
     */
    @Id
    private String id;

    /**
     * 算法名称
     */
    private String name;

    /**
     * 创建时间
     */
    @Column(name = "createdAt")
    private Date createdat;

    /**
     * 修改时间
     */
    @Column(name = "updatedAt")
    private Date updatedat;

    /**
     * 是否可用（0-不可用，1-可用）
     */
    private Integer flag;

    /**
     * 获取算法表id
     *
     * @return id - 算法表id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置算法表id
     *
     * @param id 算法表id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取算法名称
     *
     * @return name - 算法名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置算法名称
     *
     * @param name 算法名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取修改时间
     *
     * @return updatedAt - 修改时间
     */
    public Date getUpdatedat() {
        return updatedat;
    }

    /**
     * 设置修改时间
     *
     * @param updatedat 修改时间
     */
    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
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
}