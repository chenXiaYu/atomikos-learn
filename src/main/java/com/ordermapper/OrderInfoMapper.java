package com.ordermapper;

import com.domain.OrderInfo;
import org.apache.ibatis.annotations.Insert;


public interface OrderInfoMapper {

    @Insert("INSERT INTO `order` (money,userid,address,createTime) values (#{money},#{userid},#{address},#{createTime})")
    int add(OrderInfo orderInfo);
}


