package org.spoto.model;

public class StuGrade {

    private Integer cid;
    private String sname;
    private String cname;
    private String sid;
    private Double cgrade;

    public StuGrade() {
    }

    public StuGrade(Integer cid, String sname, String cname, String sid, Double cgrade) {
        this.cid = cid;
        this.sname = sname;
        this.cname = cname;
        this.sid = sid;
        this.cgrade = cgrade;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Double getCgrade() {
        return cgrade;
    }

    public void setCgrade(Double cgrade) {
        this.cgrade = cgrade;
    }

    @Override
    public String toString() {
        return "StuGrade{" +
                "cid=" + cid +
                ", sname='" + sname + '\'' +
                ", cname='" + cname + '\'' +
                ", sid='" + sid + '\'' +
                ", cgrade=" + cgrade +
                '}';
    }
}
