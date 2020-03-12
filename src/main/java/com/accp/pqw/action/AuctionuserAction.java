package com.accp.pqw.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.pqw.biz.AuctionuserBiz;
import com.accp.pqw.pojo.Auctionuser;

@RestController
@RequestMapping("/api/users")
public class AuctionuserAction {
	@Autowired
	public AuctionuserBiz ubiz;

	@PostMapping("user")
	public Map<String, String> addUsersInfo(@RequestBody Auctionuser users) {
		Map<String, String> message = new HashMap<String, String>();
		users.setUserisadmin(0);
		if (ubiz.insertSelective(users) > 0) {
			message.put("code", "200");
			message.put("msg", "ok");
		} else {
			message.put("code", "200");
			message.put("msg", "no");
		}
		return message;
	}

	@PostMapping("login")
	public Auctionuser loginUsers(@RequestBody Auctionuser users) {
		if (ubiz.selectCount(users)) {
			return ubiz.selectOne(users);
		}
		return null;
	}
}
