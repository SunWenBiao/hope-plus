package com.hope.mapper;

import com.hope.model.beans.SysResource;
import com.hope.mybatis.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

/**
 * @program:hope-plus
 * @author:aodeng
 * @create:2018-10-16 13:58
 **/
@Mapper
@Repository
public interface SysResourceMapper extends BaseMapper<SysResource>{
    List<SysResource> selectAlls();

    List<SysResource> listUrlAndPermission();

    List<SysResource> listResourcesByUserId();
    /**
     * 根据用户id查询权限集合
     * @param userId 状态
     * @return set
     */
    Set<String> findPermsByUserId(String userId);
}
