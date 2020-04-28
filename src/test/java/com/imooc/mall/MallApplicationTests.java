package com.imooc.mall;

import com.imooc.mall.dao.CategoryMapper;
import com.imooc.mall.dao.OrderMapper;
import com.imooc.mall.pojo.Category;
import com.imooc.mall.pojo.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallApplicationTests {

    @Autowired
    private CategoryMapper categoryMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Test
    void contextLoads() {
        Category category = categoryMapper.findById(100001);
        System.out.println(category.toString());
    }

    @Test
    public void queryByIdTest() {
//        Category category = categoryMapper.queryById(100001);
//        System.out.println(category.toString());
        Order order = orderMapper.selectByPrimaryKey(1);
        System.out.println(order.toString());
    }

}
