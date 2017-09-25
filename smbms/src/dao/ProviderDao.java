package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Provider;

public interface ProviderDao {
	
	/**
	 * ��ѯ���й�Ӧ��
	 * @return
	 */
	public List<Provider> queryAllProvider(@Param("currentPageNo")int currentPageNo, @Param("pageSize")int pageSize);
	
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
