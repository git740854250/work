package util;

public class Page {
	/**
	 * ������ҳ��
	 * @param totalCount ��¼����
	 * @param pageSize ÿҳ��ʾ��¼��
	 * @return
	 */
	public static int countTotalPage(int totalCount,int pageSize){
		int totalPageCount = totalCount % pageSize == 0 ? totalCount/pageSize:totalCount / pageSize+1;
		return totalPageCount;
	}
}