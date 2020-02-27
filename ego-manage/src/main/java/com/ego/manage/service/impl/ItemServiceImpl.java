package com.ego.manage.service.impl;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ego.commons.pojo.EasyUIDataGrid;
import com.ego.commons.pojo.EgoResult;
import com.ego.commons.utils.Ftputils;
import com.ego.duubo.service.ItemDubboService;
import com.ego.manage.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Value("${vsftpd.host}")
	private String host;
	@Value("${vsftpd.port}")
	private int port;
	@Value("${vsftpd.username}")
	private String username;
	@Value("${vsftpd.password}")
	private String password;
	@Value("${vsftpd.basePath}")
	private String basePath;
	@Value("${vsftpd.filePath}")
	private String filePath;
	@Reference
	private ItemDubboService itemDubboService;

	@Override
	public EasyUIDataGrid show(int pageNum, int pageSize) {
		// TODO Auto-generated method stub
		return itemDubboService.show(pageNum, pageSize);
	}

	@Override
	public EgoResult instock(String ids) {
		try {
			return itemDubboService.instock(ids);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public EgoResult reshelf(String ids) {
		try {
			return itemDubboService.reshelf(ids);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public EgoResult delete(String ids) {
		try {
			return itemDubboService.delete(ids);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean uploadImg(MultipartFile multipartFile,String filename) {
		try {
			return Ftputils.uploadFile(host, port, username, password, basePath, filePath, filename, multipartFile.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	
}
