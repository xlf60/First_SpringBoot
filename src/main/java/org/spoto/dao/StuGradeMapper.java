package org.spoto.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.spoto.model.StuGrade;
import org.spoto.model.Student;

import java.util.List;

@Mapper
public interface StuGradeMapper {

    //成绩
    List<StuGrade> slist(@Param("sid") String sid, @Param("cname") String cname, RowBounds rb);

    Integer slistCount(@Param("sid") String sid, @Param("cname") String cname);

    Integer add(StuGrade sg);

    Integer change(StuGrade sg);

    Integer del(@Param("sid") String sid, @Param("cname") String cname);
}
