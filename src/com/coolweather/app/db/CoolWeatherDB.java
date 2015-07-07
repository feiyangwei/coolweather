package com.coolweather.app.db; 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/** 
 * @author fly 
 * @version 创建时间：2015-7-6 下午5:18:19 
 * 类说明 封装数据库常用操作
 */
public class CoolWeatherDB {
	/**
	 * 数据库名
	 */
	public static final String DB_NAME = "cool_weather";
	
	/**
	 * 数据库版本
	 */
	public static final int VERSION =1;
	
	private static CoolWeatherDB coolWeatherDB;
	
	private SQLiteDatabase db;
	
	/**
	 * 将构造方法私有化
	 */
	private CoolWeatherDB(Context context){
		CoolWeatherOpenHelper dbHelper = new CoolWeatherOpenHelper(context,
				DB_NAME,null,VERSION);
		db = dbHelper.getWritableDatabase();
	}
	/**
	 * 获取CoolWeatherDB的实例
	 */
	
}
 