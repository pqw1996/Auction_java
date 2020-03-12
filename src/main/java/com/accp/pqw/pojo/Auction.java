package com.accp.pqw.pojo;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * auction
 * 
 * @author
 */
@TableName("auction")
public class Auction implements Serializable {
	/**
	 * 拍卖品编号
	 */
	@TableId(type = IdType.AUTO, value = "auctionid")
	private Integer auctionid;

	/**
	 * 拍卖品名称
	 */
	private String auctionname;

	/**
	 * 拍卖品起拍价
	 */
	private Double auctionstartprice;

	/**
	 * 拍卖品底价
	 */
	private Double auctionupset;

	/**
	 * 拍卖品拍卖开始时间
	 */
	private Date auctionstarttime;

	/**
	 * 拍卖品拍卖结束时间
	 */
	private Date auctionendtime;

	/**
	 * 拍卖品描述
	 */
	private String auctiondesc;

	/**
	 * 图片base64字符串
	 */
	private String pic;
	/**
	 * 用户id
	 */
	private int userid;
	/**
	 * 成交价
	 */
	private Double transactionprice;
//	/**
//	 * 竞拍记录集合
//	 */
//	private List<Auctionrecord> list;
	private static final long serialVersionUID = 1L;

//	public List<Auctionrecord> getList() {
//		return list;
//	}
//
//	public void setList(List<Auctionrecord> list) {
//		this.list = list;
//	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public Double getTransactionprice() {
		return transactionprice;
	}

	public void setTransactionprice(Double transactionprice) {
		this.transactionprice = transactionprice;
	}

	public Integer getAuctionid() {
		return auctionid;
	}

	public void setAuctionid(Integer auctionid) {
		this.auctionid = auctionid;
	}

	public String getAuctionname() {
		return auctionname;
	}

	public void setAuctionname(String auctionname) {
		this.auctionname = auctionname;
	}

	public Double getAuctionstartprice() {
		return auctionstartprice;
	}

	public void setAuctionstartprice(Double auctionstartprice) {
		this.auctionstartprice = auctionstartprice;
	}

	public Double getAuctionupset() {
		return auctionupset;
	}

	public void setAuctionupset(Double auctionupset) {
		this.auctionupset = auctionupset;
	}

	public Date getAuctionstarttime() {
		return auctionstarttime;
	}

	public void setAuctionstarttime(Date auctionstarttime) {
		this.auctionstarttime = auctionstarttime;
	}

	public Date getAuctionendtime() {
		return auctionendtime;
	}

	public void setAuctionendtime(Date auctionendtime) {
		this.auctionendtime = auctionendtime;
	}

	public String getAuctiondesc() {
		return auctiondesc;
	}

	public void setAuctiondesc(String auctiondesc) {
		this.auctiondesc = auctiondesc;
	}

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

//	@Override
//	public boolean equals(Object that) {
//		if (this == that) {
//			return true;
//		}
//		if (that == null) {
//			return false;
//		}
//		if (getClass() != that.getClass()) {
//			return false;
//		}
//		Auction other = (Auction) that;
//		return (this.getAuctionid() == null ? other.getAuctionid() == null
//				: this.getAuctionid().equals(other.getAuctionid()))
//				&& (this.getAuctionname() == null ? other.getAuctionname() == null
//						: this.getAuctionname().equals(other.getAuctionname()))
//				&& (this.getAuctionstartprice() == null ? other.getAuctionstartprice() == null
//						: this.getAuctionstartprice().equals(other.getAuctionstartprice()))
//				&& (this.getAuctionupset() == null ? other.getAuctionupset() == null
//						: this.getAuctionupset().equals(other.getAuctionupset()))
//				&& (this.getAuctionstarttime() == null ? other.getAuctionstarttime() == null
//						: this.getAuctionstarttime().equals(other.getAuctionstarttime()))
//				&& (this.getAuctionendtime() == null ? other.getAuctionendtime() == null
//						: this.getAuctionendtime().equals(other.getAuctionendtime()))
//				&& (this.getAuctiondesc() == null ? other.getAuctiondesc() == null
//						: this.getAuctiondesc().equals(other.getAuctiondesc()))
//				&& (Arrays.equals(this.getPic(), other.getPic()));
//	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((getAuctionid() == null) ? 0 : getAuctionid().hashCode());
//		result = prime * result + ((getAuctionname() == null) ? 0 : getAuctionname().hashCode());
//		result = prime * result + ((getAuctionstartprice() == null) ? 0 : getAuctionstartprice().hashCode());
//		result = prime * result + ((getAuctionupset() == null) ? 0 : getAuctionupset().hashCode());
//		result = prime * result + ((getAuctionstarttime() == null) ? 0 : getAuctionstarttime().hashCode());
//		result = prime * result + ((getAuctionendtime() == null) ? 0 : getAuctionendtime().hashCode());
//		result = prime * result + ((getAuctiondesc() == null) ? 0 : getAuctiondesc().hashCode());
//		result = prime * result + (getPic() == null) ? 0 : getPic().hashCode();
//		return result;
//	}

	public int getUserId() {
		return userid;
	}

	public void setUserId(int userid) {
		this.userid = userid;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getClass().getSimpleName());
		sb.append(" [");
		sb.append("Hash = ").append(hashCode());
		sb.append(", auctionid=").append(auctionid);
		sb.append(", auctionname=").append(auctionname);
		sb.append(", auctionstartprice=").append(auctionstartprice);
		sb.append(", auctionupset=").append(auctionupset);
		sb.append(", auctionstarttime=").append(auctionstarttime);
		sb.append(", auctionendtime=").append(auctionendtime);
		sb.append(", auctiondesc=").append(auctiondesc);
		sb.append(", userid=").append(userid);
		sb.append(", pic=").append(pic);
		sb.append(", serialVersionUID=").append(serialVersionUID);
		sb.append("]");
		return sb.toString();
	}

	public Auction() {
	}

	public Auction(Integer auctionid, Double transactionprice) {
		this.setAuctionid(auctionid);
		this.setTransactionprice(transactionprice);
	}
}