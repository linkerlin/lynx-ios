package com.cop.mobi.mycar.service;

import java.util.List;

import com.cop.mobi.common.KeyValuePair;

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
	List<KeyValuePair> getDiagnoseItems(List<String> codes);
}
