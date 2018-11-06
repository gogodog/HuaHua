package com.zjyx.huahua.controller;


import java.util.Date;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zjyx.huahua.model.BaseObject;
import com.zjyx.huahua.service.IHuaHuaService;


@Controller
@RequestMapping("/es")
public class EsController {
	
	@Resource
	IHuaHuaService huahuaService;

	@ResponseBody
	@RequestMapping("/save")
	public <T extends BaseObject> String save(T t){
		t.setCtime(new Date());
		return huahuaService.save(t);
	}
	
}
