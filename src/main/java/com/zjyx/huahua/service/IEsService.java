package com.zjyx.huahua.service;

public interface IEsService {

	public <T> String save(T t,String index,String type);
}
