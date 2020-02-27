package com.ego.dubbo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.baomidou.mybatisplus.plugins.Page;
import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.duubo.service.ItemDubboService;
import com.ego.mapper.ItemMapper;
import com.ego.pojo.Item;

public class ItemDubboServiceImpl implements ItemDubboService {
	@Autowired
	private ItemMapper itemMapper;

	@Override
	public EasyUIDataGrid show(int pageNum, int pageSize) {
		Page<Item> page = new Page<Item>(pageNum, pageSize);
		List<Item> items = itemMapper.selectPage(page, null);
		EasyUIDataGrid easyUIDataGrid = new EasyUIDataGrid(items, page.getTotal());
		return easyUIDataGrid;
	}

	@Override
	public EgoResult instock(String ids) throws Exception {
		EgoResult egoResult = new EgoResult();
		String[] idStrings = ids.split(",");
		int index = 0;
		for (String idString : idStrings) {
			Item item = new Item();
			item.setId(Long.parseLong(idString));
			item.setStatus(2);
			index += itemMapper.updateById(item);
		}
		if (index == idStrings.length) {
			egoResult.setStatus(200);
		} else {
			throw new Exception("instock下架失败");
		}
		return egoResult;
	}

	@Override
	public EgoResult reshelf(String ids) throws Exception {
		EgoResult egoResult = new EgoResult();
		String[] idStrings = ids.split(",");
		int index = 0;
		for (String idString : idStrings) {
			Item item = new Item();
			item.setId(Long.parseLong(idString));
			item.setStatus(1);
			index += itemMapper.updateById(item);
		}
		if (index == idStrings.length) {
			egoResult.setStatus(200);
		} else {
			throw new Exception("instock上架失败");
		}
		return egoResult;
	}

	@Override
	public EgoResult delete(String ids) throws Exception {
		EgoResult egoResult = new EgoResult();
		String[] idStrings = ids.split(",");
		int index = 0;
		for (String idString : idStrings) {
			Item item = new Item();
			item.setId(Long.parseLong(idString));
			item.setStatus(3);
			index += itemMapper.updateById(item);
		}
		if (index == idStrings.length) {
			egoResult.setStatus(200);
		} else {
			throw new Exception("instock删除失败");
		}
		return egoResult;
	}

}
