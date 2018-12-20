package com.gqy.springbootstart.entity;

import java.io.Serializable;

public class Classnode implements Serializable {
    private Integer id;

    private String name;

    private String fullname;

    private Integer calleetimes;

    private Integer callertimes;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname == null ? null : fullname.trim();
    }

    public Integer getCalleetimes() {
        return calleetimes;
    }

    public void setCalleetimes(Integer calleetimes) {
        this.calleetimes = calleetimes;
    }

    public Integer getCallertimes() {
        return callertimes;
    }

    public void setCallertimes(Integer callertimes) {
        this.callertimes = callertimes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", fullname=").append(fullname);
        sb.append(", calleetimes=").append(calleetimes);
        sb.append(", callertimes=").append(callertimes);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}