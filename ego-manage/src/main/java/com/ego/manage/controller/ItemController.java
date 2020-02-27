package com.ego.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.manage.service.ItemService;

@Controller
@ResponseBody
public class ItemController {
	@Autowired
	private ItemService itemService;
	@RequestMapping("/item/list")
	public EasyUIDataGrid itemList(@RequestParam(value = "page",required = true) int pageNum,
									@RequestParam(value = "rows",required = true) int pageSize) {
		return itemService.show(pageNum, pageSize);
	}
	
	@RequestMapping("/rest/item/instock")
	public EgoResult restItemInstock(@RequestParam(value = "ids",required = true) String ids) {
		return itemService.instock(ids);
	}
	
	@RequestMapping("/rest/item/reshelf")
	public EgoResult restItemReshelf(@RequestParam(value = "ids",required = true) String ids) {
		return itemService.reshelf(ids);
	}
	
	@RequestMapping("/rest/item/delete")
	public EgoResult restItemDelete(@RequestParam(value = "ids",required = true) String ids) {
		return itemService.delete(ids);
	}
	
}
