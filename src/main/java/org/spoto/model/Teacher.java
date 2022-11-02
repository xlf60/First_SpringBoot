package org.spoto.model;

public class Teacher {

    private String tname;
    private String tpasswd;

    public Teacher() {
    }

    public Teacher(String tname, String tpassed) {
        this.tname = tname;
        this.tpasswd = tpassed;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTpasswd() {
        return tpasswd;
    }

    public void setTpasswd(String tpasswd) {
        this.tpasswd = tpasswd;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tname='" + tname + '\'' +
                ", tpassed='" + tpasswd + '\'' +
                '}';
    }
}
