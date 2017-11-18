package com.company.dao.pojo;

public class Reprot {
	private String dname;
	private String loc;
	private Double maxSal; 
	private Double minSal;
	private Double avgSal;
	private Double sumSal;
	private Integer count;
	
	public Reprot() {
		// TODO Auto-generated constructor stub
	}
	
	public Reprot(String dname, String loc, Double maxSal, Double minSal, Double avgSal, Double sumSal, Integer count) {
		super();
		this.dname = dname;
		this.loc = loc;
		this.maxSal = maxSal;
		this.minSal = minSal;
		this.avgSal = avgSal;
		this.sumSal = sumSal;
		this.count = count;
	}
	
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public Double getMaxSal() {
		return maxSal;
	}

	public void setMaxSal(Double maxSal) {
		this.maxSal = maxSal;
	}

	public Double getMinSal() {
		return minSal;
	}

	public void setMinSal(Double minSal) {
		this.minSal = minSal;
	}

	public Double getAvgSal() {
		return avgSal;
	}

	public void setAvgSal(Double avgSal) {
		this.avgSal = avgSal;
	}

	public Double getSumSal() {
		return sumSal;
	}

	public void setSumSal(Double sumSal) {
		this.sumSal = sumSal;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Reprot [dname=" + dname + ", loc=" + loc + ", maxSal=" + maxSal + ", minSal=" + minSal + ", avgSal="
				+ avgSal + ", sumSal=" + sumSal + ", count=" + count + "]";
	}
	
	
	
}
