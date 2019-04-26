package com.gqy.springbootstart.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ALGORITHMS_PARAM")
public class AlgorithmsParam {
    /**
     * 算法参数表id
     */
    @Id
    private String id;

    /**
     * 算法表id
     */
    @Column(name = "algorithmsId")
    private String algorithmsid;

    /**
     * 算法参数
     */
    private String param;

    /**
     * 参数次序
     */
    private Integer order;

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
     * 是否可用（0-不可以，1-可用）
     */
    private Integer flag;

    /**
     * 获取算法参数表id
     *
     * @return id - 算法参数表id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置算法参数表id
     *
     * @param id 算法参数表id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取算法表id
     *
     * @return algorithmsId - 算法表id
     */
    public String getAlgorithmsid() {
        return algorithmsid;
    }

    /**
     * 设置算法表id
     *
     * @param algorithmsid 算法表id
     */
    public void setAlgorithmsid(String algorithmsid) {
        this.algorithmsid = algorithmsid;
    }

    /**
     * 获取算法参数
     *
     * @return param - 算法参数
     */
    public String getParam() {
        return param;
    }

    /**
     * 设置算法参数
     *
     * @param param 算法参数
     */
    public void setParam(String param) {
        this.param = param;
    }

    /**
     * 获取参数次序
     *
     * @return order - 参数次序
     */
    public Integer getOrder() {
        return order;
    }

    /**
     * 设置参数次序
     *
     * @param order 参数次序
     */
    public void setOrder(Integer order) {
        this.order = order;
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