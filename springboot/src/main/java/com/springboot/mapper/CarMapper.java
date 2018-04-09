package com.springboot.mapper;

import com.springboot.domain.Car;
import org.apache.catalina.LifecycleState;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

public interface CarMapper {
    @Select("select id,name,price,create_date from car")
    @Results({
            @Result(property = "createDate",column = "create_date")
    })
    List<Car> find();

    @Select("select id,name,price,create_date createDate from car where id=#{id}")
    Car findById(Integer id);

    @Insert("insert into car(name,price,create_date) values(#{name},#{price},#{createDate})")
    int add(Car car);

    @Update("update car set name=#{name},price=#{price},create_date=#{createDate} where id=#{id}")
    int modify(Car car);

    @Delete("delete from car where id=#{id}")
    int remove(Integer id);

    List<Car> findByParam(
            @Param("name") String name,
            @Param("beginDate") Date beginDate,
            @Param("endDate") Date endDate);
}


