package com.cop.mobi.mycar.service;

import java.util.List;

import com.cop.mobi.common.Result;

/**
 * 
 * @author chris.liu
 *
 */
public interface DiagnoseService {
	
	/**
	 * 获取指定诊断码信息
	 * @param codes
	 * @return
	 */
	Result getDiagnoseItems(List<String> codes);
}
