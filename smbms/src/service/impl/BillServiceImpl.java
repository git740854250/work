package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.BillDao;

import pojo.Bill;
import service.BillService;

@Service("billService")
public class BillServiceImpl implements BillService {
	
	@Autowired
	private BillDao billDao;
	
	public void setBillDao(BillDao billDao) {
		this.billDao = billDao;
	}
	
	/**
	 * ��ѯ���ж���
	 */
	@Override
	public List<Bill> queryAllBill(int currentPageNo, int pageSize) {
		// TODO Auto-generated method stub
		return billDao.queryAllBill(currentPageNo, pageSize);
	}

	/**
	 * ��ѯ��������
	 */
	@Override
	public int queryBillNumber() {
		// TODO Auto-generated method stub
		return billDao.queryBillNumber();
	}

	/**
	 * ���ݱ�Ų�ѯ����
	 */
	@Override
	public Bill queryIdByBill(Integer id) {
		// TODO Auto-generated method stub
		return billDao.queryIdByBill(id);
	}
}
