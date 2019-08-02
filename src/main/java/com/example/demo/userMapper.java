package com.example.demo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface userMapper {
    @Select("select * from USER where id=#{id}")
     User getUser(String id);

//    @Insert("insert into USER ")
}
