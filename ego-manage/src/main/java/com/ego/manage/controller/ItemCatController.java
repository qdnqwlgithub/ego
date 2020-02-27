package com.ego.manage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ego.commons.pojo.EasyUiTree;
import com.ego.manage.service.ItemCatService;

@Controller
@ResponseBody
public class ItemCatController {
	@Autowired
	private ItemCatService itemCatService;
	
	@RequestMapping(value = "/item/cat/list")
	public List<EasyUiTree> itemCatList(@RequestParam(value = "id",required = true,defaultValue = "0") long id){
		return itemCatService.showPickItemCatById(id);
	}
}
