package com.baobaotao.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	public static String defaultSimpleFormater = "yyyy-MM-dd hh:mm:ss";

	/**
	 * 9.* 默认简单日期字符串 10.* 1 * @return 12.
	 */
	public static String getDefaultSimpleFormater() {
		return defaultSimpleFormater;
	}

	/**
	 * 17.* 设置默认简单日期格式字符串 18.* 19.* @param defaultFormatString 20.
	 */
	public static void setDefaultSimpleFormater(String defaultFormatString) {
		DateUtil.defaultSimpleFormater = defaultFormatString;
	}

	/**
	 * 25.* 格式化日期 26.* 27.* @param date 28.* @param formatString 29.* @return
	 * 30.
	 */
	public static String format(Date date, String formatString) {
		SimpleDateFormat df = new SimpleDateFormat(formatString);
		return df.format(date);
	}

	/**
	 * 36.* 格式化日期(使用默认格式) 37.* 38.* @param date 39.* @return 40.
	 */
	public static String format(Date date) {
		return format(date, defaultSimpleFormater);
	}

	/**
	 * 45.* 转换成日期 46.* 47.* @param dateString 48.* @param formatString 49.* @return
	 * 50.
	 */
	public static Date parse(String dateString, String formatString) {
		SimpleDateFormat df = new SimpleDateFormat(formatString);
		try {
			return df.parse(dateString);
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * 60.* 转换成日期(使用默认格式) 6 * 62.* @param dateString 63.* @return 64.
	 */
	public static Date parse(String dateString) {
		return parse(dateString, defaultSimpleFormater);
	}

	/**
	 * 69.* 昨天 70.* 7 * @return 72.
	 */
	public static Date yesterday() {
		return addDay(-1);
	}

	/**
	 * 77.* 明天 78.* 79.* @return 80.
	 */
	public static Date tomorrow() {
		return addDay(1);
	}

	/**
	 * 85.* 现在 86.* 87.* @return 88.
	 */
	public static Date now() {
		return new Date(System.currentTimeMillis());
	}

	/**
	 * 93.* 按日加 94.* 95.* @param value 96.* @return 97.
	 */
	public static Date addDay(int value) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.DAY_OF_YEAR, value);
		return now.getTime();
	}

	/**
	 * 104.* 按日加,指定日期 105.* 106.* @param date 107.* @param value 108.* @return
	 * 109.
	 */
	public static Date addDay(Date date, int value) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.add(Calendar.DAY_OF_YEAR, value);
		return now.getTime();
	}

	/**
	 * 117.* 按月加 118.* 119.* @param value 120.* @return 12
	 */
	public static Date addMonth(int value) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.MONTH, value);
		return now.getTime();
	}

	/**
	 * 128.* 按月加,指定日期 129.* 130.* @param date 13 * @param value 132.* @return
	 * 133.
	 */
	public static Date addMonth(Date date, int value) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.add(Calendar.MONTH, value);
		return now.getTime();
	}

	/**
	 * 14 * 按年加 142.* 143.* @param value 144.* @return 145.
	 */
	public static Date addYear(int value) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.YEAR, value);
		return now.getTime();
	}

	/**
	 * 152.* 按年加,指定日期 153.* 154.* @param date 155.* @param value 156.* @return
	 * 157.
	 */
	public static Date addYear(Date date, int value) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.add(Calendar.YEAR, value);
		return now.getTime();
	}

	/**
	 * 165.* 按小时加 166.* 167.* @param value 168.* @return 169.
	 */
	public static Date addHour(int value) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.HOUR_OF_DAY, value);
		return now.getTime();
	}

	/**
	 * 176.* 按小时加,指定日期 177.* 178.* @param date 179.* @param value 180.* @return
	 * 18
	 */
	public static Date addHour(Date date, int value) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.add(Calendar.HOUR_OF_DAY, value);
		return now.getTime();
	}

	/**
	 * 189.* 按分钟加 190.* 19 * @param value 192.* @return 193.
	 */
	public static Date addMinute(int value) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.MINUTE, value);
		return now.getTime();
	}

	/**
	 * 200.* 按分钟加,指定日期 20 * 202.* @param date 203.* @param value 204.* @return
	 */
	public static Date addMinute(Date date, int value) {
		Calendar now = Calendar.getInstance();
		now.setTime(date);
		now.add(Calendar.MINUTE, value);
		return now.getTime();
	}

	/**
	 * 213.* 年份 214.* 215.* @return 216.
	 */
	public static int year() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.YEAR);
	}

	/**
	 * 222.* 月份 223.* 224.* @return 225.
	 */
	public static int month() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.MONTH);
	}

	/**
	 * 23 * 日(号) 232.* 233.* @return 234.
	 */
	public static int day() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 240.* 小时(点) 24 * 242.* @return 243.
	 */
	public static int hour() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.HOUR);
	}

	/**
	 * 249.* 分钟 250.*
	 * 
	 * @return
	 */
	public static int minute() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.MINUTE);
	}

	/**
	 * 258.* 秒 259.* 260.* @return
	 */
	public static int second() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.SECOND);
	}

	/**
	 * 267.* 星期几(礼拜几) 268.* 269.* @return
	 */
	public static int weekday() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.DAY_OF_WEEK) - 1;
	}

	/**
	 ** 是上午吗? 277.* 278.* @return 279.
	 */
	public static boolean isAm() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.AM_PM) == 0;
	}

	/**
	 * 是下午吗?
	 * 
	 * @return
	 */
	public static boolean isPm() {
		Calendar now = Calendar.getInstance();
		return now.get(Calendar.AM_PM) == 1;
	}
}
