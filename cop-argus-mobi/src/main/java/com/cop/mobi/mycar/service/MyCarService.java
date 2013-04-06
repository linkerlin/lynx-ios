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
	
	/**
	 * 根据车辆id获取车辆信息
	 * 
	 * @param obd
	 * @return
	 */
	Result getMyCarById(int id);

	/**
	 * 根据OBD设备id获取车辆信息
	 * 
	 * @param obd
	 * @return
	 */
	Result getMyCarByOBD(String obd);

	/**
	 * 获取用户所有车辆
	 * 
	 * @param uid
	 * @return
	 */
	Result getMyCars(int uid);

	/**
	 * 注册车辆信息
	 * 
	 * @param myCar
	 * @return
	 */
	Result addMyCar(MyCar myCar);

	/**
	 * 获取车辆行车状况
	 * 
	 * @param mcid
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	Result getDriveRoutes(int mcid, long beginTime, long endTime);

	/**
	 * 存储客户端行车信息到server并记录数据log
	 * 
	 * @param mcid
	 * @param data
	 * @param startTime
	 * @param endTime
	 * @return
	 */
	Result uploadDriveRoutes(int mcid, String data, long startTime, long endTime);

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
