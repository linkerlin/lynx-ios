package com.cop.mobile.test.car;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cop.mobi.car.entity.DriveRoutePo;
import com.cop.mobi.car.entity.MyCar;
import com.cop.mobi.car.service.dao.MyCarDao;
import com.cop.mobile.test.BaseTest;

/**
 * 
 * @author chris.liu
 * 
 */
public class MyCarDaoTest extends BaseTest {

	@Autowired
	private MyCarDao myCarDao;

	@Test
	public void getMyCarTest() {
		try {
			MyCar myCar = myCarDao.getMyCar("uid", 2);
			if (myCar != null) {
				System.out.println(myCar.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void addMyCarTest() {
		MyCar registerCar = new MyCar();
		registerCar.setUid(3);
		registerCar.setNameCH("大众宝来1.6T");
		registerCar.setObd("E20A39F4-73F5-4BC4-A12F-17D1AD07A961");
		registerCar.setPrice(125000);
		registerCar.setBuyDate(1362529391000l);
		try {
			Object result = myCarDao.addMyCar(registerCar);
			MyCar finalMyCar = myCarDao.getMyCar("uid", 3);
			if (finalMyCar != null) {
				System.out.println(finalMyCar.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void statusTest() {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date beginTime = sdf.parse("2013-03-02 00:00:00");
			Date endTime = sdf.parse("2013-03-03 00:00:00");
			List<DriveRoutePo> status = myCarDao.getMyCarStatus(1, beginTime.getTime(),
					endTime.getTime());
			if (status != null) {
				for (DriveRoutePo s : status) {
					System.out.println(sdf.format(new Date(s.getAddTime())));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
