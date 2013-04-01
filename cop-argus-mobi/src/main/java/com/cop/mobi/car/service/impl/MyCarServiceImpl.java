package com.cop.mobi.car.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cop.mobi.car.entity.DriveRoute;
import com.cop.mobi.car.entity.DriveRoutePo;
import com.cop.mobi.car.entity.MyCar;
import com.cop.mobi.car.service.MyCarService;
import com.cop.mobi.car.service.dao.MyCarDao;
import com.cop.mobi.common.AbstractService;
import com.cop.mobi.common.Message;
import com.cop.mobi.common.Result;
import com.cop.mobi.common.Result.ResultStatus;
import com.cop.mobi.rest.core.SpringApplicationContext;

/**
 * 
 * @author chris.liu
 * 
 */
@Service
public class MyCarServiceImpl extends AbstractService implements MyCarService {

	private static final String Tag = "MyCarServiceImpl";

	private static MyCarDao myCarDao;

	static {
		try {
			myCarDao = (MyCarDao) SpringApplicationContext.getBean("myCarDao");
		} catch (Exception e) {
			error(Tag, "init error", e);
		}
	}

	@Override
	public Result getMyCar(int uid) {
		try {
			MyCar myCar = myCarDao.getMyCar("uid", uid);
			if (myCar != null) {
				return new Result(ResultStatus.RS_OK, myCar);
			} else {
				return new Result(ResultStatus.RS_FAIL, new Message("waring",
						"cant find the car"));
			}
		} catch (Exception e) {
			error(Tag, String.format("getMyCarByUid(%d)", uid), e);
			return new Result(ResultStatus.RS_ERROR, new Message("error",
					"server inner error"));
		}
	}

	@Override
	public Result addMyCar(MyCar myCar) {
		return null;
	}

	@Override
	public Result getMyCarStatus(int mcid, long beginTime, long endTime) {
		try {
			List<DriveRoutePo> drps = myCarDao.getMyCarStatus(mcid, beginTime,
					endTime);
			if (drps != null && drps.size() > 0) {
				List<DriveRoute> drs = new ArrayList<DriveRoute>();
				for (DriveRoutePo drp : drps) {
					DriveRoute dr = new DriveRoute(drp);
					drs.add(dr);
				}
				Result result = new Result(ResultStatus.RS_OK, drs);
				return result;
			} else {
				return new Result(ResultStatus.RS_FAIL, new Message("waring",
						"cant find the car's status"));
			}
		} catch (Exception e) {
			error(Tag, String.format("getMyCarStatus(%d, %d, %d)", mcid,
					beginTime, endTime), e);
			return new Result(ResultStatus.RS_ERROR, new Message("error",
					"server inner error"));
		}
	}

}
