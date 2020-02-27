package com.ego.manage.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.duubo.service.ItemDubboService;

public interface ItemService {
	/**
	 * 后台页面分页查询item
	 * 
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	EasyUIDataGrid show(int pageNum, int pageSize);

	/**
	 * 下架
	 * 
	 * @param ids
	 * @return
	 */
	EgoResult instock(String ids);

	/**
	 * 上架
	 * 
	 * @return
	 */
	EgoResult reshelf(String ids);

	/**
	 * 删除
	 * 
	 * @param ids
	 * @return
	 */
	EgoResult delete(String ids);
	
	/**
	 * 添加图片
	 * @param multipartFile
	 * @return
	 */
	boolean uploadImg(MultipartFile multipartFile,String filename);
}
