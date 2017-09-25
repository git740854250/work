package service;

import java.util.List;

import pojo.Provider;

public interface ProviderService {
	
	/**
	 * 查询所有供应商
	 * @return
	 */
	public List<Provider> queryAllProvider(int currentPageNo, int pageSize);
	
	/**
	 * 查询供应商数量
	 * @return
	 */
	public int queryProviderNumber();
	
	/**
	 * 新增供应商
	 * @param provider 供应商
	 * @return
	 */
	public int addProvider(Provider provider);
	
	/**
	 * 根据编号查询供应商
	 * @param id
	 * @return
	 */
	public Provider queryIdByPrivider(Integer id);
	
	/**
	 * 删除供应商
	 * @param id
	 * @return
	 */
	public int deleteProvider(int id);
}
