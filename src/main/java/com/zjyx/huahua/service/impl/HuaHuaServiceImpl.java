package com.zjyx.huahua.service.impl;

import org.springframework.stereotype.Service;

import com.zjyx.huahua.service.IHuaHuaService;

@Service
public class HuaHuaServiceImpl extends EsServiceImpl implements IHuaHuaService {
	
	String index="huahua_index";
	String type="huahua";

	@Override
	public <T> String save(T t) {
		return super.save(t, index, type);
	}

}
