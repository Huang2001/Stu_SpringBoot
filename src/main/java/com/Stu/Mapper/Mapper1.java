package com.Stu.Mapper;


import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface Mapper1{

    public int insertTable1(String field2);

    public String selectTable1(int field1);
}
