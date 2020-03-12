package com.accp.pqw.dao;

import com.accp.pqw.pojo.Auctionrecord;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface AuctionrecordDAO extends BaseMapper<Auctionrecord> {
	int deleteByPrimaryKey(Integer id);

	int insert(Auctionrecord record);

	int insertSelective(Auctionrecord record);

	Auctionrecord selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Auctionrecord record);

	int updateByPrimaryKey(Auctionrecord record);
}