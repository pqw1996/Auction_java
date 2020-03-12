package com.accp.pqw.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * auctionrecord
 * 
 * @author
 */
@TableName("auctionrecord")
public class Auctionrecord implements Serializable {
	/**
	 * 竞拍记录编号
	 */
	@TableId(type = IdType.AUTO, value = "id")
	private Integer id;

	/**
	 * 竞拍者编号
	 */
	private Integer userid;

	/**
	 * 拍卖品编号
	 */
	private Integer auctionid;

	/**
	 * 竞价时间
	 */
	private Date auctiontime;

	/**
	 * 竞拍价格
	 */
	private Double auctionprice;
	/**
	 * 用户姓名
	 */
	private String username;

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getAuctionid() {
		return auctionid;
	}

	public void setAuctionid(Integer auctionid) {
		this.auctionid = auctionid;
	}

	public Date getAuctiontime() {
		return auctiontime;
	}

	public void setAuctiontime(Date auctiontime) {
		this.auctiontime = auctiontime;
	}

	public Double getAuctionprice() {
		return auctionprice;
	}

	public void setAuctionprice(Double auctionprice) {
		this.auctionprice = auctionprice;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		Auctionrecord other = (Auctionrecord) that;
		return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
				&& (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
				&& (this.getAuctionid() == null ? other.getAuctionid() == null
						: this.getAuctionid().equals(other.getAuctionid()))
				&& (this.getAuctiontime() == null ? other.getAuctiontime() == null
						: this.getAuctiontime().equals(other.getAuctiontime()))
				&& (this.getAuctionprice() == null ? other.getAuctionprice() == null
						: this.getAuctionprice().equals(other.getAuctionprice()));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
		result = prime * result + ((getAuctionid() == null) ? 0 : getAuctionid().hashCode());
		result = prime * result + ((getAuctiontime() == null) ? 0 : getAuctiontime().hashCode());
		result = prime * result + ((getAuctionprice() == null) ? 0 : getAuctionprice().hashCode());
		return result;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", id=").append(id);
		sb.append(", userid=").append(userid);
		sb.append(", auctionid=").append(auctionid);
		sb.append(", auctiontime=").append(auctiontime);
		sb.append(", auctionprice=").append(auctionprice);
		sb.append(", username=").append(username);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}
}