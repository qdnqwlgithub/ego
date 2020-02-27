package com.ego.duubo.service;

import com.baomidou.mybatisplus.plugins.Page;
import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.pojo.Item;

public interface ItemDubboService {
	/**
	 * 后台页面分页查询item
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	EasyUIDataGrid show(int pageNum,int pageSize);
	
	/**
	 * 下架
	 * @param ids
	 * @return
	 */
	EgoResult instock(String ids) throws Exception ;
	
	/**
	 * 上架
	 * @return
	 */
	EgoResult reshelf(String ids) throws Exception ;
	
	/**
	 * 删除
	 * @param ids
	 * @return
	 */
	EgoResult delete(String ids) throws Exception ;
}
