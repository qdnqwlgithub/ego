package com.ego.dubbo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.ego.commons.pojo.EasyUiTree;
import com.ego.duubo.service.ItemCatDubboService;
import com.ego.mapper.ItemCatMapper;
import com.ego.pojo.ItemCat;

public class ItemCatDubboServiceImpl implements ItemCatDubboService{
	@Autowired
	private ItemCatMapper itemCatMapper;

	@Override
	public List<EasyUiTree> showByParentId(long parentId) {
		// TODO Auto-generated method stub
		List<ItemCat> itemCats=selByParentId(parentId);
		List<EasyUiTree> easyUiTrees=new ArrayList<EasyUiTree>();
		for (ItemCat itemCat : itemCats) {
			EasyUiTree easyUiTree=new EasyUiTree();
			easyUiTree.setId(itemCat.getId());
			easyUiTree.setText(itemCat.getName());
			easyUiTree.setState(itemCat.getIsParent()==1?"closed":"open");
			easyUiTrees.add(easyUiTree);
		}
		return easyUiTrees;
	}

	@Override
	public List<ItemCat> selByParentId(long parentId) {
		EntityWrapper<ItemCat> entityWrapper=new EntityWrapper<ItemCat>();
		entityWrapper.eq("parent_id", parentId);
		return itemCatMapper.selectList(entityWrapper);
	}
	
	
}
