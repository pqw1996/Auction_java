package com.accp.pqw.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.pqw.biz.AuctionBiz;
import com.accp.pqw.pojo.Auction;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/items")
public class AuctionAction {
	@Autowired
	private AuctionBiz biz;

	@PostMapping("save")
	public int save(@RequestBody Auction auction) {
		System.err.println("save:" + auction.toString());
		return biz.save(auction);
	}

	@PostMapping("update")
	public int update(@RequestBody Auction auction) {
		System.err.println("update:" + auction.toString());
		return biz.update(auction);
	}

	@PostMapping("pageList/{num}/{size}/{isAdmin}/{id}")
	public PageInfo<Auction> pageList(@RequestBody Auction auction, @PathVariable int num, @PathVariable int size,
			@PathVariable int isAdmin, @PathVariable int id) {
		System.err.println("pageList:" + auction.toString());
		System.err.println(num + "\t" + size + "\t" + isAdmin + "\t" + id);
		return biz.pageList(auction, num, size, isAdmin, id);
	}

	@PostMapping("pageList/{num}/{size}")
	public PageInfo<Auction> pageList1(@RequestBody Auction auction, @PathVariable int num, @PathVariable int size) {
		System.err.println("pageList1:" + auction.toString());
		System.err.println(num + "\t" + size);
		return biz.pageList1(num, size, auction);
	}

	@DeleteMapping("delete/{id}")
	public int delete(@PathVariable int id) {
		System.err.println("delete:" + id);
		return biz.delete(id);
	}

//	@PostMapping("findOne/{id}")
//	public Auction findOne(@PathVariable int id) {
//		System.err.println(id);
//		return biz.getOne(id);
//	}
}
