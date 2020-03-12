package com.accp.pqw.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.pqw.dao.AuctionuserDAO;
import com.accp.pqw.pojo.Auctionuser;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionuserBiz {
	@Autowired
	private AuctionuserDAO dao;

	public int insertSelective(Auctionuser user) {
		return dao.insertSelective(user);
	}

	public boolean selectCount(Auctionuser user) {
		QueryWrapper<Auctionuser> qw = Wrappers.query();
		qw.eq("username", user.getUsername()).eq("userpassword", user.getUserpassword());
		return dao.selectCount(qw) > 0;
	}

	public Auctionuser selectOne(Auctionuser user) {
		QueryWrapper<Auctionuser> qw = Wrappers.query();
		qw.eq("username", user.getUsername()).eq("userpassword", user.getUserpassword());
		return dao.selectOne(qw);
	}
}
