package org.spoto.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.spoto.model.Teacher;

@Mapper
public interface LoginMapper {

    Teacher doLogin(@Param("tname") String tname, @Param("tpasswd")String tpasswd);
}
