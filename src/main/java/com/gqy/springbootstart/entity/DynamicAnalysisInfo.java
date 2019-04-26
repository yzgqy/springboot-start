package com.gqy.springbootstart.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;
import javax.persistence.*;

@Table(name = "DYNAMIC_ANALYSIS_INFO")
public class DynamicAnalysisInfo {
    /**
     * 动态分析表id
     */
    @Id
    private String id;

    /**
     * 项目id
     */
    @Column(name = "appId")
    private String appid;

    /**
     * 动态分析开始时间
     */
    @Column(name = "startTine")
    private Date starttine;

    /**
     * 动态分析结束时间
     */
    @Column(name = "endTime")
    private Date endtime;

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
     * 是否可用（0-可用，1-不可用）
     */
    private Integer flag;

    /**
     * 结点类型（0-类结点，1-方法结点）
     */
    private Integer type;

    /**
     * 获取动态分析表id
     *
     * @return id - 动态分析表id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置动态分析表id
     *
     * @param id 动态分析表id
     */
    public void setId(String id) {
        this.id = id;
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
     * 获取动态分析开始时间
     *
     * @return startTine - 动态分析开始时间
     */
    public Date getStarttine() {
        return starttine;
    }

    /**
     * 设置动态分析开始时间
     *
     * @param starttine 动态分析开始时间
     */
    public void setStarttine(Date starttine) {
        this.starttine = starttine;
    }

    /**
     * 获取动态分析结束时间
     *
     * @return endTime - 动态分析结束时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置动态分析结束时间
     *
     * @param endtime 动态分析结束时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
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
     * 获取是否可用（0-可用，1-不可用）
     *
     * @return flag - 是否可用（0-可用，1-不可用）
     */
    public Integer getFlag() {
        return flag;
    }

    /**
     * 设置是否可用（0-可用，1-不可用）
     *
     * @param flag 是否可用（0-可用，1-不可用）
     */
    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    /**
     * 获取结点类型（0-类结点，1-方法结点）
     *
     * @return type - 结点类型（0-类结点，1-方法结点）
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置结点类型（0-类结点，1-方法结点）
     *
     * @param type 结点类型（0-类结点，1-方法结点）
     */
    public void setType(Integer type) {
        this.type = type;
    }
}