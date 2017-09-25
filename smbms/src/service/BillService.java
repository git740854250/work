package service;

import java.util.List;

import pojo.Bill;

public interface BillService {
	
	/**
	 * ��ѯ���ж���
	 * @return
	 */
	public List<Bill> queryAllBill(int currentPageNo, int pageSize);
	
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
