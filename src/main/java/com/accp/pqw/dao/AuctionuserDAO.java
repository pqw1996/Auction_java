package com.accp.pqw.dao;

import com.accp.pqw.pojo.Auctionuser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface AuctionuserDAO extends BaseMapper<Auctionuser> {
	int deleteByPrimaryKey(Integer userid);

	int insert(Auctionuser record);

	int insertSelective(Auctionuser record);

	Auctionuser selectByPrimaryKey(Integer userid);

	int updateByPrimaryKeySelective(Auctionuser record);

	int updateByPrimaryKey(Auctionuser record);
}