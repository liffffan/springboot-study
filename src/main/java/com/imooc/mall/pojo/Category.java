package com.imooc.mall.pojo;

import lombok.Data;

import java.util.Date;

// po(persistent object) 持久层对象
// pojo(plian ordinary java object)
@Data
public class Category {
    private Integer id;
    private Integer parentId;
    private String name;
    private Integer status;
    private Integer sortOrder;
    private Date createTime;
    private Date updateTime;

}
