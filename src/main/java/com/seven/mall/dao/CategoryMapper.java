package com.seven.mall.dao;

import com.seven.mall.entity.Category;
import org.springframework.stereotype.Repository;

/**
* Created by Mybatis Generator on 2021/08/29
*/
@Repository
public interface CategoryMapper {

    // 根据id查询商品分类
    Category selectByPrimaryKey(Integer id);

    int deleteByPrimaryKey(Integer id);

    int insert(Category record);

    int insertSelective(Category record);


    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}