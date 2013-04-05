package com.cop.mobi.mycar.service;

import com.cop.mobi.common.Result;
import com.cop.mobi.mycar.entity.MyCar;
import com.cop.mobi.mycar.entity.OilBill;

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
	 * 
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

	/**
	 * 新增加油账单
	 * 
	 * @param bill
	 * @return
	 */
	Result addBill(OilBill bill);

	/**
	 * 获取账单明细
	 * 
	 * @param uid
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	Result getBills(int uid, long beginTime, long endTime);

	/**
	 * 删除账单
	 * 
	 * @param bid
	 * @return
	 */
	Result deleteBill(int bid);
}
