package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.Bill;

public interface BillDao {
	
	/**
	 * 查询所有订单
	 * @return
	 */
	public List<Bill> queryAllBill(@Param("currentPageNo")int currentPageNo, @Param("pageSize")int pageSize);
	
	/**
	 * 查询订单数量
	 * @return
	 */
	public int queryBillNumber();
	
	/**
	 * 根据编号查询商品
	 * @param id
	 * @return
	 */
	public Bill queryIdByBill(Integer id);
}
