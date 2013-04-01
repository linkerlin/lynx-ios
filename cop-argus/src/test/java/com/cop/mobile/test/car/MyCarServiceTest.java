package com.cop.mobile.test.car;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

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
				System.out.println(result.toString());

				JSONObject jo = new JSONObject(result.toString());
				System.out.println(jo.toString());
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
		
		Response resp = Response.status(Status.OK)
				.header("Content-Type", "text/html;charset=UTF-8").entity("你好")
				.build();
		System.out.println(resp.getEntity());
	}
}
