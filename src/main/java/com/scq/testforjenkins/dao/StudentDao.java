package com.scq.testforjenkins.dao;

import com.scq.testforjenkins.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Write class comments here
 * *
 * User: scq
 * Date: 2019/12/3 15:40
 * version $Id: StudentDao.java, v 0.1 Exp $
 */
@Mapper
public interface StudentDao {

    @Insert("insert into student values(null,#{name}, #{age}, #{gender})")
    int save(Student student);

    @Select("select * from student where id = #{id}")
    @Results({
            @Result(property = "name",  column = "name", javaType = String.class),
            @Result(property = "age", column = "age", javaType = Integer.class),
            @Result(property = "gender", column = "gender", javaType = Byte.class)
    })
    List<Student> findById(Long id);
}
