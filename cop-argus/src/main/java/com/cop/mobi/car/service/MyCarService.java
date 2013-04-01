package com.cop.mobi.car.service;

import com.cop.mobi.car.entity.MyCar;
import com.cop.mobi.common.Result;

/**
 * 
 * @author chris.liu
 * 
 */
public interface MyCarService {

	Result getMyCar(int uid);
	
	Result addMyCar(MyCar myCar);

	Result getMyCarStatus(int mcid, long beginTime, long endTime);
}
