package com.cop.mobi.mycar.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cop.mobi.common.AbstractService;
import com.cop.mobi.common.KeyValuePair;
import com.cop.mobi.mycar.service.DiagnoseService;
import com.cop.mobi.mycar.service.dao.DiagnoseDao;
import com.cop.mobi.rest.core.SpringApplicationContext;

/**
 * 
 * @author chris.liu
 * 
 */
public class DiagnoseServiceImpl extends AbstractService implements DiagnoseService {
	private static final String Tag = "DiagnoseServiceImpl";

	private static final Map<String, String> OBD_CODES = new HashMap<String, String>();

	private static DiagnoseDao diagnoseDao;

	static {
		try {
			diagnoseDao = (DiagnoseDao) SpringApplicationContext.getBean("diagnoseDao");
			
			List<KeyValuePair> items = diagnoseDao.getAllDiagnoseItems();
			if (items != null && items.size() > 0) {
				for (KeyValuePair pair : items) {
					OBD_CODES.put(pair.getKey(), pair.getValue());
				}
			}
		} catch (Exception e) {
			error(Tag, "init error", e);
		}
	}

	public Map<String, String> getAllDiagnoseItems() {
		return OBD_CODES;
	}
	
	public List<KeyValuePair> getBaseDiagnoseItems() {
		return null;
	}

	@Override
	public List<KeyValuePair> getDiagnoseItems(List<String> codes) {
		List<KeyValuePair> items = new ArrayList<KeyValuePair>();
		for (String key : codes) {
			String val = OBD_CODES.get(key);
			KeyValuePair item = new KeyValuePair(key, val);
			items.add(item);
		}
		return items;
	}
}
