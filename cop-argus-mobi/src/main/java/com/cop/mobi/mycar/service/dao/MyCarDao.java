package com.cop.mobi.mycar.service.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cop.mobi.mycar.entity.DriveRoutePo;
import com.cop.mobi.mycar.entity.MyCar;

/**
 * 
 * @author chris.liu
 * 
 */
public interface MyCarDao {
	
	Object addMyCar(MyCar myCar);
	
	MyCar getMyCar(@Param(value = "key") String key,
			@Param(value = "val") Object val);

	/**
	 * get my car status by my car id during beginDate and end date
	 * 
	 * @param mcid
	 * @param beginDate
	 * @param endDate
	 * @return
	 */
	List<DriveRoutePo> getMyCarStatus(@Param(value = "mcid") int mcid,
			@Param(value = "beginTime") long beginTime,
			@Param(value = "endTime") long endTime);
}
