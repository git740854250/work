package util;

public class Page {
	/**
	 * 计算总页数
	 * @param totalCount 记录总数
	 * @param pageSize 每页显示记录数
	 * @return
	 */
	public static int countTotalPage(int totalCount,int pageSize){
		int totalPageCount = totalCount % pageSize == 0 ? totalCount/pageSize:totalCount / pageSize+1;
		return totalPageCount;
	}
}