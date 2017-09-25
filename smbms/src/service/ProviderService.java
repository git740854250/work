package service;

import java.util.List;

import pojo.Provider;

public interface ProviderService {
	
	/**
	 * ��ѯ���й�Ӧ��
	 * @return
	 */
	public List<Provider> queryAllProvider(int currentPageNo, int pageSize);
	
	/**
	 * ��ѯ��Ӧ������
	 * @return
	 */
	public int queryProviderNumber();
	
	/**
	 * ������Ӧ��
	 * @param provider ��Ӧ��
	 * @return
	 */
	public int addProvider(Provider provider);
	
	/**
	 * ���ݱ�Ų�ѯ��Ӧ��
	 * @param id
	 * @return
	 */
	public Provider queryIdByPrivider(Integer id);
	
	/**
	 * ɾ����Ӧ��
	 * @param id
	 * @return
	 */
	public int deleteProvider(int id);
}
