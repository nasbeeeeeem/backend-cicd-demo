package com.example.restapi.mapper;

import com.example.restapi.entity.Item;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ItemMapper {
  Item findById(int id);
}
