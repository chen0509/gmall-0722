package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chen
 * @email cwj@atguigu.com
 * @date 2019-12-02 19:04:09
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
