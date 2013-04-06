package com.cop.mobi.mycar.service.impl;

import java.util.List;

import com.cop.mobi.common.AbstractService;
import com.cop.mobi.mycar.entity.OilBill;
import com.cop.mobi.mycar.service.OilBillService;
import com.cop.mobi.mycar.service.dao.OilBillDao;
import com.cop.mobi.rest.core.SpringApplicationContext;

/**
 * 
 * @author chris.liu
 * 
 */
public class OilBillServiceImpl extends AbstractService implements
		OilBillService {

	private static final String Tag = "OilBillServiceImpl";

	private static OilBillDao oilBillDao;

	static {
		try {
			oilBillDao = (OilBillDao) SpringApplicationContext
					.getBean("oilBillDao");
		} catch (Exception e) {
			error(Tag, "init error", e);
		}
	}

	@Override
	public List<OilBill> getBills(int uid, long beginTime, long endTime) {
		try {
			List<OilBill> bills = oilBillDao.getOilBills(uid, beginTime,
					endTime);
			return bills;
		} catch (Exception e) {
			error(Tag, "getBills()", e);
		}
		return null;
	}

}
