package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.ProviderDao;

import pojo.Provider;
import service.ProviderService;

@Service("providerService")
public class ProviderServiceImpl implements ProviderService {

	@Autowired
	private ProviderDao providerDao;
	
	public void setProviderDao(ProviderDao providerDao) {
		this.providerDao = providerDao;
	}
	
	/**
	 * 查询所有供应商
	 */
	@Override
	public List<Provider> queryAllProvider(int currentPageNo, int pageSize) {
		// TODO Auto-generated method stub
		return providerDao.queryAllProvider(currentPageNo, pageSize);
	}

	/**
	 * 查询供应商数量
	 */
	@Override
	public int queryProviderNumber() {
		// TODO Auto-generated method stub
		return providerDao.queryProviderNumber();
	}

	/**
	 * 新增供应商
	 */
	@Override
	public int addProvider(Provider provider) {
		// TODO Auto-generated method stub
		return providerDao.addProvider(provider);
	}

	/**
	 * 根据编号查询供应商
	 */
	@Override
	public Provider queryIdByPrivider(Integer id) {
		// TODO Auto-generated method stub
		return providerDao.queryIdByPrivider(id);
	}

	/**
	 * 删除供应商
	 */
	@Override
	public int deleteProvider(int id) {
		// TODO Auto-generated method stub
		return providerDao.deleteProvider(id);
	}
}
