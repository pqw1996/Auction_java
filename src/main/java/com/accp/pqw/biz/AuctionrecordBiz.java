package com.accp.pqw.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.pqw.dao.AuctionrecordDAO;
import com.accp.pqw.pojo.Auctionrecord;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionrecordBiz {
	@Autowired
	private AuctionrecordDAO dao;

	public List<Auctionrecord> findList(int id) {
		QueryWrapper<Auctionrecord> qw = Wrappers.query();
		qw.eq("auctionId", id);
		qw.orderByDesc("auctionTime");
		return dao.selectList(qw);
	}

	public int save(Auctionrecord record) {
		return dao.insert(record);
	}
}
