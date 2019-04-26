package com.gqy.springbootstart.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;
import javax.persistence.*;

@Table(name = "STATIC_CALL_INFO")
public class StaticCallInfo {
    /**
     * 静态信息id
     */
    @Id
    private String id;

    /**
     * 调用结点id
     */
    private String caller;

    /**
     * 被调用结点id
     */
    private String callee;

    /**
     * 调用次数
     */
    private Integer count;

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
     * 获取静态信息id
     *
     * @return id - 静态信息id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置静态信息id
     *
     * @param id 静态信息id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取调用结点id
     *
     * @return caller - 调用结点id
     */
    public String getCaller() {
        return caller;
    }

    /**
     * 设置调用结点id
     *
     * @param caller 调用结点id
     */
    public void setCaller(String caller) {
        this.caller = caller;
    }

    /**
     * 获取被调用结点id
     *
     * @return callee - 被调用结点id
     */
    public String getCallee() {
        return callee;
    }

    /**
     * 设置被调用结点id
     *
     * @param callee 被调用结点id
     */
    public void setCallee(String callee) {
        this.callee = callee;
    }

    /**
     * 获取调用次数
     *
     * @return count - 调用次数
     */
    public Integer getCount() {
        return count;
    }

    /**
     * 设置调用次数
     *
     * @param count 调用次数
     */
    public void setCount(Integer count) {
        this.count = count;
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
}