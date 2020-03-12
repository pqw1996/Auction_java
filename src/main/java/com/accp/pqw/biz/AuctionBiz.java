package com.accp.pqw.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.pqw.dao.AuctionDAO;
import com.accp.pqw.pojo.Auction;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionBiz {
	@Autowired
	private AuctionDAO dao;

	public int save(Auction auction) {
		return dao.insert(auction);
	}

	public int update(Auction auction) {
		return dao.updateById(auction);
	}

	public PageInfo<Auction> pageList(Auction auction, int num, int size, int isAdmin, int id) {
		QueryWrapper<Auction> qw = Wrappers.query();
		// 模糊查询
		qw.like("auctionName", auction.getAuctionname());
		qw.like("auctionDesc", auction.getAuctiondesc());
		// 如果不为空，分别是=，>=和<=查询。
		qw.eq(auction.getAuctionstartprice() != null, "auctionStartPrice", auction.getAuctionstartprice());
		qw.le(auction.getAuctionendtime() != null, "auctionEndTime", auction.getAuctionendtime());
		qw.ge(auction.getAuctionstarttime() != null, "auctionStartTime", auction.getAuctionstarttime());
		// 按开始时间降序
		qw.orderByDesc("auctionStartTime");
		// 如果不是管理员，就按id查询
		if (isAdmin == 0) {
			qw.eq("userid", id);
		}
		PageHelper.startPage(num, size);
		return new PageInfo<Auction>(dao.selectList(qw));
	}

	public PageInfo<Auction> pageList1(int num, int size, Auction auction) {
		QueryWrapper<Auction> qw = Wrappers.query();
		qw.le(auction.getAuctionendtime() != null, "auctionEndTime", auction.getAuctionendtime());
		PageHelper.startPage(num, size);
		return new PageInfo<Auction>(dao.selectList(qw));
	}

	public int delete(int id) {
		return dao.deleteById(id);
	}

	public Auction getOne(int auctionid) {
		return dao.selectByPrimaryKey(auctionid);
	}

}
