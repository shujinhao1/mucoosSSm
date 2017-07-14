package com.huazai.entity;

public class Moocsheader {
    private Integer heaid;

    private String insexname;

    public Integer getHeaid() {
        return heaid;
    }

    public void setHeaid(Integer heaid) {
        this.heaid = heaid;
    }

    public String getInsexname() {
        return insexname;
    }

    public void setInsexname(String insexname) {
        this.insexname = insexname == null ? null : insexname.trim();
    }

	@Override
	public String toString() {
		return "Moocsheader [heaid=" + heaid + ", insexname=" + insexname + "]";
	}
    
    
}