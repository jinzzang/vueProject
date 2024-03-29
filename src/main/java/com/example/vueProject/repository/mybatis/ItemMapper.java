package com.example.vueProject.repository.mybatis;

import com.example.vueProject.domain.Item;
import com.example.vueProject.repository.ItemSearchCond;
import com.example.vueProject.repository.ItemUpdateDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Optional;

@Mapper
public interface ItemMapper {

    void save(Item item);

}
