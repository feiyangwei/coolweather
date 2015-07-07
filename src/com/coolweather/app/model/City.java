package com.coolweather.app.model; 
/** 
 * @author fly 
 * @version 创建时间：2015-7-6 下午4:55:00 
 * 类说明 城市
 */
public class City {
	private int id;
	private String cityName;
	private String cityCode;
	private int procinceId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityCode() {
		return cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	public int getProcinceId() {
		return procinceId;
	}
	public void setProcinceId(int procinceId) {
		this.procinceId = procinceId;
	}
	
	
}
 