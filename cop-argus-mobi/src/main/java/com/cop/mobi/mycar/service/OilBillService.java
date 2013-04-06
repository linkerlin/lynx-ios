package com.cop.mobi.mycar.service;

import java.util.List;

import com.cop.mobi.mycar.entity.OilBill;

/**
 * 
 * @author chris.liu
 * 
 */
public interface OilBillService {

	/**
	 * 获取用户某段时间之间的油单
	 * 
	 * @param uid
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	List<OilBill> getBills(int uid, long beginTime, long endTime);
}
