package com.qf.yunyou.entity;


public class TabSeller {

  private long sid;
  private String sname;
  private String consphone;
  private String address;


  public long getSid() {
    return sid;
  }

  public void setSid(long sid) {
    this.sid = sid;
  }


  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }


  public String getConsphone() {
    return consphone;
  }

  public void setConsphone(String consphone) {
    this.consphone = consphone;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "TabSeller{" +
            "sid=" + sid +
            ", sname='" + sname + '\'' +
            ", consphone='" + consphone + '\'' +
            ", address='" + address + '\'' +
            '}';
  }
}