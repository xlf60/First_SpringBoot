package org.spoto.model;

import java.util.Date;

public class Student {

    private Integer id;
    private String sid;
    private String sname;
    private Integer ssex;
    private Integer sage;
    private String snianji;
    private Date sdate;

    public Student() {
    }

    public Student(Integer id, String sid, String sname, Integer ssex, Integer sage, String snianji, Date sdate) {
        this.id = id;
        this.sid = sid;
        this.sname = sname;
        this.ssex = ssex;
        this.sage = sage;
        this.snianji = snianji;
        this.sdate = sdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSsex() {
        return ssex;
    }

    public void setSsex(Integer ssex) {
        this.ssex = ssex;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }

    public String getSnianji() {
        return snianji;
    }

    public void setSnianji(String snianji) {
        this.snianji = snianji;
    }

    public Date getSdate() {
        return sdate;
    }

    public void setSdate(Date sdate) {
        this.sdate = sdate;
    }
}
