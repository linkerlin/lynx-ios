package com.cop.mobi.mycar.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cop.mobi.mycar.entity.OilBill;

/**
 * 
 * @author chris.liu
 * 
 */
public interface OilBillDao {

	List<OilBill> getOilBills(@Param(value = "uid") int uid,
			@Param(value = "beginTime") long beginTime,
			@Param(value = "endTime") long endTime);
}
