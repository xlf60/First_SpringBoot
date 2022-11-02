package org.spoto.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.spoto.model.StuGrade;
import org.spoto.model.Student;

import java.util.List;

@Mapper
public interface StudentMapper {

    //学生信息
    List<Student> list(@Param("sid") String sid, @Param("sname") String sname, RowBounds rb);

    Integer listCount(@Param("sid") String sid, @Param("sname") String sname);

    Integer add(Student sd);

    Integer change(Student sd);

    Integer del(@Param("ids")List<Integer> ids);


}
