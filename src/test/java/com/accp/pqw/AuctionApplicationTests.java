package com.accp.pqw;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.pqw.biz.AuctionBiz;
import com.accp.pqw.biz.AuctionrecordBiz;

@SpringBootTest
class AuctionApplicationTests {
	@Autowired
	private AuctionBiz biz;
	@Autowired
	private AuctionrecordBiz biz1;

	@Test
	public void Obj() {
		biz.getOne(1);
	}

	@Test
	public void findList() {
		biz1.findList(11).forEach(i -> {
			System.err.println(i.getUsername());
		});
	}
}
