package com.example.restapi.controller;

import com.example.restapi.dto.ItemResponse;
import com.example.restapi.entity.Item;
import com.example.restapi.mapper.ItemMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/items")
public class ItemController {
  @Autowired
  ItemMapper itemMapper;

  @GetMapping("/{id}")
  public ItemResponse findById(@PathVariable int id) {
    // DBからidをキーにデータを取得
    Item item = itemMapper.findById(id);

    // Responseにデータをコピーしてreturn
    ItemResponse itemResponse = new ItemResponse();
    BeanUtils.copyProperties(item, itemResponse);
    return itemResponse;
  }
}
