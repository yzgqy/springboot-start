package com.gqy.springbootstart.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;
import javax.persistence.*;

@Table(name = "PARTITION_RESULT")
public class PartitionResult {
    /**
     * 划分结果id
     */
    @Id
    private String id;

    /**
     * 描述
     */
    private String desc;

    /**
     * 名称
     */
    private String name;

    /**
     * 算法id
     */
    @Column(name = "algorithmsId")
    private String algorithmsid;

    /**
     * 动态分析id
     */
    @Column(name = "dynamicAnalysisInfoId")
    private String dynamicanalysisinfoid;

    /**
     * 项目id
     */
    @Column(name = "appId")
    private String appid;

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
     * 是否可用（0-不可用，1-可用）
     */
    private Integer flag;

    /**
     * 结点类型（0-类结点，1-方法结点）
     */
    private Integer type;

    /**
     * 结果排序
     */
    private Integer order;

    /**
     * 获取划分结果id
     *
     * @return id - 划分结果id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置划分结果id
     *
     * @param id 划分结果id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取描述
     *
     * @return desc - 描述
     */
    public String getDesc() {
        return desc;
    }

    /**
     * 设置描述
     *
     * @param desc 描述
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取算法id
     *
     * @return algorithmsId - 算法id
     */
    public String getAlgorithmsid() {
        return algorithmsid;
    }

    /**
     * 设置算法id
     *
     * @param algorithmsid 算法id
     */
    public void setAlgorithmsid(String algorithmsid) {
        this.algorithmsid = algorithmsid;
    }

    /**
     * 获取动态分析id
     *
     * @return dynamicAnalysisInfoId - 动态分析id
     */
    public String getDynamicanalysisinfoid() {
        return dynamicanalysisinfoid;
    }

    /**
     * 设置动态分析id
     *
     * @param dynamicanalysisinfoid 动态分析id
     */
    public void setDynamicanalysisinfoid(String dynamicanalysisinfoid) {
        this.dynamicanalysisinfoid = dynamicanalysisinfoid;
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

    /**
     * 获取结果排序
     *
     * @return order - 结果排序
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * 设置结果排序
     *
     * @param order 结果排序
     */
    public void setOrder(Integer order) {
        this.order = order;
    }
}