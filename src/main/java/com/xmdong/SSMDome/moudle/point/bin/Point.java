package com.xmdong.SSMDome.moudle.point.bin;

public class Point {

	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Float getPointX() {
		return pointX;
	}
	public void setPointX(Float pointX) {
		this.pointX = pointX;
	}
	public Float getPointY() {
		return pointY;
	}
	public void setPointY(Float pointY) {
		this.pointY = pointY;
	}
	public Boolean getIsFinish() {
		return isFinish;
	}
	public void setIsFinish(Boolean isFinish) {
		this.isFinish = isFinish;
	}
	private Float pointX;
	private Float pointY;
	private Boolean isFinish;
	@Override
	public String toString() {
		return "Point [id=" + id + ", pointX=" + pointX + ", pointY=" + pointY + ", isFinish=" + isFinish + "]";
	}
	
}
