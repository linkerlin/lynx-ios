package com.cop.mobi.mycar.service;

import com.cop.mobi.common.Result;
import com.cop.mobi.mycar.entity.OilBill;

/**
 * 
 * @author chris.liu
 * 
 */
public interface OilBillService {

	/**
	 * 新增账单
	 * 
	 * @param bill
	 * @return
	 */
	Result addBill(OilBill bill);

	/**
	 * 获取用户某段时间之间的油单
	 * 
	 * @param uid
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	Result getBills(int uid, long beginTime, long endTime);

	/**
	 * 删除某一份账单
	 * 
	 * @param bill
	 * @return
	 */
	Result deleteBill(OilBill bill);
}
