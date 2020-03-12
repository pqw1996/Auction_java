package com.accp.pqw.pojo;

import java.io.Serializable;

/**
 * auctionuser
 * @author 
 */
public class Auctionuser implements Serializable {
    /**
     * 用户编号
     */
    private Integer userid;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String userpassword;

    /**
     * 用户身份证号
     */
    private String usercardno;

    /**
     * 用户电话
     */
    private String usertel;

    /**
     * 用户地址
     */
    private String useraddress;

    /**
     * 用户邮政编号
     */
    private Integer userpostnumber;

    /**
     * 用户是否是管理员，0是竞拍者，1是管理员，默认值是0
     */
    private Integer userisadmin;

    /**
     * 用户找回密码的问题
     */
    private String userquestion;

    /**
     * 用户找回密码答案
     */
    private String useranswer;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUsercardno() {
        return usercardno;
    }

    public void setUsercardno(String usercardno) {
        this.usercardno = usercardno;
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public Integer getUserpostnumber() {
        return userpostnumber;
    }

    public void setUserpostnumber(Integer userpostnumber) {
        this.userpostnumber = userpostnumber;
    }

    public Integer getUserisadmin() {
        return userisadmin;
    }

    public void setUserisadmin(Integer userisadmin) {
        this.userisadmin = userisadmin;
    }

    public String getUserquestion() {
        return userquestion;
    }

    public void setUserquestion(String userquestion) {
        this.userquestion = userquestion;
    }

    public String getUseranswer() {
        return useranswer;
    }

    public void setUseranswer(String useranswer) {
        this.useranswer = useranswer;
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
        Auctionuser other = (Auctionuser) that;
        return (this.getUserid() == null ? other.getUserid() == null : this.getUserid().equals(other.getUserid()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getUserpassword() == null ? other.getUserpassword() == null : this.getUserpassword().equals(other.getUserpassword()))
            && (this.getUsercardno() == null ? other.getUsercardno() == null : this.getUsercardno().equals(other.getUsercardno()))
            && (this.getUsertel() == null ? other.getUsertel() == null : this.getUsertel().equals(other.getUsertel()))
            && (this.getUseraddress() == null ? other.getUseraddress() == null : this.getUseraddress().equals(other.getUseraddress()))
            && (this.getUserpostnumber() == null ? other.getUserpostnumber() == null : this.getUserpostnumber().equals(other.getUserpostnumber()))
            && (this.getUserisadmin() == null ? other.getUserisadmin() == null : this.getUserisadmin().equals(other.getUserisadmin()))
            && (this.getUserquestion() == null ? other.getUserquestion() == null : this.getUserquestion().equals(other.getUserquestion()))
            && (this.getUseranswer() == null ? other.getUseranswer() == null : this.getUseranswer().equals(other.getUseranswer()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUserid() == null) ? 0 : getUserid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getUserpassword() == null) ? 0 : getUserpassword().hashCode());
        result = prime * result + ((getUsercardno() == null) ? 0 : getUsercardno().hashCode());
        result = prime * result + ((getUsertel() == null) ? 0 : getUsertel().hashCode());
        result = prime * result + ((getUseraddress() == null) ? 0 : getUseraddress().hashCode());
        result = prime * result + ((getUserpostnumber() == null) ? 0 : getUserpostnumber().hashCode());
        result = prime * result + ((getUserisadmin() == null) ? 0 : getUserisadmin().hashCode());
        result = prime * result + ((getUserquestion() == null) ? 0 : getUserquestion().hashCode());
        result = prime * result + ((getUseranswer() == null) ? 0 : getUseranswer().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", userpassword=").append(userpassword);
        sb.append(", usercardno=").append(usercardno);
        sb.append(", usertel=").append(usertel);
        sb.append(", useraddress=").append(useraddress);
        sb.append(", userpostnumber=").append(userpostnumber);
        sb.append(", userisadmin=").append(userisadmin);
        sb.append(", userquestion=").append(userquestion);
        sb.append(", useranswer=").append(useranswer);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}