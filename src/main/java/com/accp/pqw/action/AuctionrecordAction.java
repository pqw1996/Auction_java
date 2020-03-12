package com.accp.pqw.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.pqw.biz.AuctionBiz;
import com.accp.pqw.biz.AuctionrecordBiz;
import com.accp.pqw.pojo.Auction;
import com.accp.pqw.pojo.Auctionrecord;

@RestController
@RequestMapping("/api/reds")
public class AuctionrecordAction {
	@Autowired
	private AuctionrecordBiz biz;
	@Autowired
	private AuctionBiz biz1;

	@PostMapping("findList/{id}")
	public List<Auctionrecord> findList(@PathVariable int id) {
		return biz.findList(id);
	}

	@PostMapping("save")
	public int save(@RequestBody Auctionrecord record) {
		System.err.println("save:" + record.toString());
		return biz.save(record) + biz1.update(new Auction(record.getAuctionid(), record.getAuctionprice()));
	}
}
