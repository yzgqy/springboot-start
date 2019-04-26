package com.gqy.springbootstart.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;
import javax.persistence.*;

public class App {
    /**
     * 项目表id
     */
    @Id
    private String id;

    /**
     * 项目名称
     */
    private String name;

    /**
     * 项目路径
     */
    private String path;

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
     * 结点个数
     */
    @Column(name = "nodeNumber")
    private Integer nodenumber;

    /**
     * 是否可用（0-不可以，1-可用）
     */
    private Integer flag;

    /**
     * 获取项目表id
     *
     * @return id - 项目表id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置项目表id
     *
     * @param id 项目表id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取项目名称
     *
     * @return name - 项目名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置项目名称
     *
     * @param name 项目名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取项目路径
     *
     * @return path - 项目路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置项目路径
     *
     * @param path 项目路径
     */
    public void setPath(String path) {
        this.path = path;
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
     * 获取结点个数
     *
     * @return nodeNumber - 结点个数
     */
    public Integer getNodenumber() {
        return nodenumber;
    }

    /**
     * 设置结点个数
     *
     * @param nodenumber 结点个数
     */
    public void setNodenumber(Integer nodenumber) {
        this.nodenumber = nodenumber;
    }

    /**
     * 获取是否可用（0-不可以，1-可用）
     *
     * @return flag - 是否可用（0-不可以，1-可用）
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置是否可用（0-不可以，1-可用）
     *
     * @param flag 是否可用（0-不可以，1-可用）
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }
}