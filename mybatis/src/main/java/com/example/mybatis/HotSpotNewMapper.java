package com.example.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.mybatis.HotSpotNew;

@Mapper
public interface HotSpotNewMapper{

    @Select("select * from hotspotnew where id = #{id}")
    public HotSpotNew selectUserById(int id);

    @Select("select * from hotspotnew where name = #{userName}")
    public List<HotSpotNew> selectUserByName(String userName);

    @Insert("insert into hotspotnew(name,des) values (#{userName},#{userAge})")
    public void addUser(HotSpotNew hotSpotNew);

    @Update("update hotspotnew set name=#{userName},des=#{userDes} where id=#{id}")
    public void updateUser(HotSpotNew hotSpotNew);

    @Delete("delete from hotspotnew where id=#{id}")
    public void deleteUser(int id);

}