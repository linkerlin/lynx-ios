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

	/**
	 * 获取车辆行车
	 * @param mcid
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	Result getMyCarDriveRoutes(int mcid, long beginTime, long endTime);

	/**
	 * 存储客户端行车信息到server并记录数据log
	 * 
	 * @param mcid
	 * @param data
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	Result pushDriveRouteData(int mcid, String data, long startTime,
			long endTime);
}
