package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chen
 * @email cwj@atguigu.com
 * @date 2019-12-02 19:10:16
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
