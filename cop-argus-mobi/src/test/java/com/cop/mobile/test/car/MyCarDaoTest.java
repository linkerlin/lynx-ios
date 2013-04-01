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
	public void myCarTest() {
		try {
			MyCar myCar = myCarDao.getMyCar("uid", 1);
			if (myCar != null) {
				System.out.println(myCar.toString());
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
