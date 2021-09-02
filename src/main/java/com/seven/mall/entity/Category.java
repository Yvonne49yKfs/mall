package com.seven.mall.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
* Created by Mybatis Generator on 2021/08/29
*/
@Data
@Component
public class Category {
    private Integer id;

    private Integer parentId;

    private String name;

    private Integer status;

    private Integer sortOrder;

    private Date createTime;

    private Date updateTime;
}