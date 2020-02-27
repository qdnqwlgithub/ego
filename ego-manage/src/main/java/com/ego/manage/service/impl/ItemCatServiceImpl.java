package com.ego.manage.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ego.commons.pojo.EasyUiTree;
import com.ego.duubo.service.ItemCatDubboService;
import com.ego.manage.service.ItemCatService;

@Service
public class ItemCatServiceImpl implements ItemCatService{
	@Reference
	private ItemCatDubboService itemCatDubboService;

	@Override
	public List<EasyUiTree> showPickItemCatById(long id) {
		// TODO Auto-generated method stub
		return itemCatDubboService.showByParentId(id);
	}
	
	
}
