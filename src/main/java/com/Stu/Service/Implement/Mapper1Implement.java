package com.Stu.Service.Implement;

import com.Stu.Mapper.Mapper1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mapper1Implement implements Mapper1
{
    public Mapper1Implement()
    {
        System.out.println("mapper is ini");
    }

    @Autowired
    private Mapper1 mapper1;

    public Mapper1Implement(Mapper1 mapper1)
    {
        this.mapper1=mapper1;
    }

    @Override
    public int insertTable1(String filed2)
    {
       return mapper1.insertTable1(filed2);
    }

    @Override
    public String selectTable1(int field1) {
       String field2=mapper1.selectTable1(field1);
       return field2;
    }
}
