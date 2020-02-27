package com.ego.duubo.service;

import java.util.List;

import com.ego.commons.pojo.EasyUiTree;
import com.ego.pojo.ItemCat;

public interface ItemCatDubboService {
	/**
	 * 选择类目显示功能
	 * @return
	 */
	List<EasyUiTree> showByParentId(long parentId);
	
	List<ItemCat> selByParentId(long parentId);
}
