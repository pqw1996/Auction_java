package com.accp.pqw.dao;

import com.accp.pqw.pojo.Auction;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface AuctionDAO extends BaseMapper<Auction> {
	int deleteByPrimaryKey(Integer auctionid);

	int insert(Auction record);

	int insertSelective(Auction record);

	Auction selectByPrimaryKey(Integer auctionid);

	int updateByPrimaryKeySelective(Auction record);

	int updateByPrimaryKeyWithBLOBs(Auction record);

	int updateByPrimaryKey(Auction record);
}