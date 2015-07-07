package com.coolweather.app.db; 

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/** 
 * @author fly 
 * @version ����ʱ�䣺2015-7-6 ����5:18:19 
 * ��˵�� ��װ���ݿⳣ�ò���
 */
public class CoolWeatherDB {
	/**
	 * ���ݿ���
	 */
	public static final String DB_NAME = "cool_weather";
	
	/**
	 * ���ݿ�汾
	 */
	public static final int VERSION =1;
	
	private static CoolWeatherDB coolWeatherDB;
	
	private SQLiteDatabase db;
	
	/**
	 * �����췽��˽�л�
	 */
	private CoolWeatherDB(Context context){
		CoolWeatherOpenHelper dbHelper = new CoolWeatherOpenHelper(context,
				DB_NAME,null,VERSION);
		db = dbHelper.getWritableDatabase();
	}
	/**
	 * ��ȡCoolWeatherDB��ʵ��
	 */
	
}
 