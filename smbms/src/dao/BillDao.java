package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Bill;

public interface BillDao {
	
	/**
	 * ��ѯ���ж���
	 * @return
	 */
	public List<Bill> queryAllBill(@Param("currentPageNo")int currentPageNo, @Param("pageSize")int pageSize);
	
	/**
	 * ��ѯ��������
	 * @return
	 */
	public int queryBillNumber();
	
	/**
	 * ���ݱ�Ų�ѯ��Ʒ
	 * @param id
	 * @return
	 */
	public Bill queryIdByBill(Integer id);
}
