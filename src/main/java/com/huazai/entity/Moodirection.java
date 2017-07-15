package com.huazai.entity;

public class Moodirection {
    private Integer dirid;

    private String dirname;

    private Integer pdirid;

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
        this.dirname = dirname == null ? null : dirname.trim();
    }

    public Integer getPdirid() {
        return pdirid;
    }

    public void setPdirid(Integer pdirid) {
        this.pdirid = pdirid;
    }

	@Override
	public String toString() {
		return "moodirection [dirid=" + dirid + ", dirname=" + dirname + ", pdirid=" + pdirid + "]";
	}
}