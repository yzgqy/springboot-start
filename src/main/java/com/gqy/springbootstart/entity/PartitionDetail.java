package com.gqy.springbootstart.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;
import javax.persistence.*;

@Table(name = "PARTITION_DETAIL")
public class PartitionDetail {
    /**
     * 划分细节表id
     */
    @Id
    private String id;

    /**
     * 结点id
     */
    @Column(name = "nodeId")
    private String nodeid;

    /**
     * 划分结果表id
     */
    @Column(name = "patitionResultId")
    private String patitionresultid;

    /**
     * 开始时间
     */
    @Column(name = "createdAt")
    private Date createdat;

    /**
     * 结束时间
     */
    @Column(name = "updatedAt")
    private Date updatedat;

    /**
     * 结点类型（0-类结点，1-方法结点）
     */
    private Integer type;

    /**
     * 是否可用（0-不可用，1-可用）
     */
    private Integer flag;

    /**
     * 获取划分细节表id
     *
     * @return id - 划分细节表id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置划分细节表id
     *
     * @param id 划分细节表id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取结点id
     *
     * @return nodeId - 结点id
     */
    public String getNodeid() {
        return nodeid;
    }

    /**
     * 设置结点id
     *
     * @param nodeid 结点id
     */
    public void setNodeid(String nodeid) {
        this.nodeid = nodeid;
    }

    /**
     * 获取划分结果表id
     *
     * @return patitionResultId - 划分结果表id
     */
    public String getPatitionresultid() {
        return patitionresultid;
    }

    /**
     * 设置划分结果表id
     *
     * @param patitionresultid 划分结果表id
     */
    public void setPatitionresultid(String patitionresultid) {
        this.patitionresultid = patitionresultid;
    }

    /**
     * 获取开始时间
     *
     * @return createdAt - 开始时间
     */
    public Date getCreatedat() {
        return createdat;
    }

    /**
     * 设置开始时间
     *
     * @param createdat 开始时间
     */
    public void setCreatedat(Date createdat) {
        this.createdat = createdat;
    }

    /**
     * 获取结束时间
     *
     * @return updatedAt - 结束时间
     */
    public Date getUpdatedat() {
        return updatedat;
    }

    /**
     * 设置结束时间
     *
     * @param updatedat 结束时间
     */
    public void setUpdatedat(Date updatedat) {
        this.updatedat = updatedat;
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