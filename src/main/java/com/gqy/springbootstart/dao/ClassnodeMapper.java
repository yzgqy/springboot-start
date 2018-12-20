package com.gqy.springbootstart.dao;

import com.gqy.springbootstart.entity.Classnode;
import com.gqy.springbootstart.entity.ClassnodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassnodeMapper {
    int countByExample(ClassnodeExample example);

    int deleteByExample(ClassnodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Classnode record);

    int insertSelective(Classnode record);

    List<Classnode> selectByExample(ClassnodeExample example);

    Classnode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Classnode record, @Param("example") ClassnodeExample example);

    int updateByExample(@Param("record") Classnode record, @Param("example") ClassnodeExample example);

    int updateByPrimaryKeySelective(Classnode record);

    int updateByPrimaryKey(Classnode record);
}