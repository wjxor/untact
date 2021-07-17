package com.wjxor.untact.util;
 
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	public static String getNowDateStr() {
		SimpleDateFormat NowDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date time = new Date();

		return NowDate.format(time);
	}
}
