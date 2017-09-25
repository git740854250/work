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
	 * ��ѯ���й�Ӧ��
	 */
	@Override
	public List<Provider> queryAllProvider(int currentPageNo, int pageSize) {
		// TODO Auto-generated method stub
		return providerDao.queryAllProvider(currentPageNo, pageSize);
	}

	/**
	 * ��ѯ��Ӧ������
	 */
	@Override
	public int queryProviderNumber() {
		// TODO Auto-generated method stub
		return providerDao.queryProviderNumber();
	}

	/**
	 * ������Ӧ��
	 */
	@Override
	public int addProvider(Provider provider) {
		// TODO Auto-generated method stub
		return providerDao.addProvider(provider);
	}

	/**
	 * ���ݱ�Ų�ѯ��Ӧ��
	 */
	@Override
	public Provider queryIdByPrivider(Integer id) {
		// TODO Auto-generated method stub
		return providerDao.queryIdByPrivider(id);
	}

	/**
	 * ɾ����Ӧ��
	 */
	@Override
	public int deleteProvider(int id) {
		// TODO Auto-generated method stub
		return providerDao.deleteProvider(id);
	}
}
