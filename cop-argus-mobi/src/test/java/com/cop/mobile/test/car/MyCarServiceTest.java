package com.cop.mobile.test.car;

import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cop.mobi.car.service.MyCarService;
import com.cop.mobi.common.Result;
import com.cop.mobile.test.BaseTest;

/**
 * 
 * @author chris.liu
 * 
 */
public class MyCarServiceTest extends BaseTest {

	@Autowired
	private MyCarService myCarService;

	@Test
	public void myCarServiceTest4Route() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date beginDate = sdf.parse("2013-03-02 00:00:00");
			Date endDate = sdf.parse("2013-03-06 00:00:00");
			Result result = myCarService.getMyCarStatus(1, beginDate.getTime(),
					endDate.getTime());
			if (result != null) {
				JSONObject jo = new JSONObject(result.toString());
				System.out.println(jo.toString());
				System.out.println(jo.toString().getBytes().length);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		Date date = new Date();
		System.out.println(date.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		date = sdf.parse("2013-03-06 08:21:11");
		System.out.println("2013-03-06 08:21:11:\t" + date.getTime());

		date = sdf.parse("2013-03-06 08:22:11");
		System.out.println("2013-03-06 08:22:11:\t" + date.getTime());

		date = sdf.parse("2013-03-06 08:23:11");
		System.out.println("2013-03-06 08:23:11:\t" + date.getTime());

		date = sdf.parse("2013-03-06 08:24:11");
		System.out.println("2013-03-06 08:24:11:\t" + date.getTime());

		date = sdf.parse("2013-03-06 08:25:11");
		System.out.println("2013-03-06 08:25:11:\t" + date.getTime());

		date = sdf.parse("2013-03-06 08:26:11");
		System.out.println("2013-03-06 08:26:11:\t" + date.getTime());

		date = sdf.parse("2013-03-06 08:27:11");
		System.out.println("2013-03-06 08:27:11:\t" + date.getTime());

		date = sdf.parse("2013-03-06 08:28:11");
		System.out.println("2013-03-06 08:28:11:\t" + date.getTime());

		date = sdf.parse("2013-03-06 08:29:11");
		System.out.println("2013-03-06 08:29:11:\t" + date.getTime());

		date = sdf.parse("2013-03-06 08:30:11");
		System.out.println("2013-03-06 08:30:11:\t" + date.getTime());
		
		String test = "%7B%22status%22%3A400%2C%22data%22%3A%7B%22title%22%3A%22login+error%22%2C%22content%22%3A%22%E7%94%A8%E6%88%B7%E4%B8%8D%E5%AD%98%E5%9C%A8%22%7D%7D";
		System.out.println(URLDecoder.decode(test, "utf-8"));
	}
}
