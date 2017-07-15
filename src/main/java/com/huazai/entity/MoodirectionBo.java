package com.huazai.entity;

public class MoodirectionBo {
	 private Integer dirid;

     private  String dirname;

     private String parentDirName;

	public Integer getDirid() {
		return dirid;
	}

	public void setDirid(Integer dirid) {
		this.dirid = dirid;
	}

	public String getDirname() {
		return dirname;
	}

	public void setDirname(String dirname) {
		this.dirname = dirname;
	}

	public String getParentDirName() {
		return parentDirName;
	}

	public void setParentDirName(String parentDirName) {
		this.parentDirName = parentDirName;
	}

	@Override
	public String toString() {
		return "MoodirectionBo [dirid=" + dirid + ", dirname=" + dirname + ", parentDirName=" + parentDirName + "]";
	}
     
     
}
