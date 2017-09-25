package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.BillService;
import service.ProviderService;
import util.Page;

@Controller
@RequestMapping("/bill")
public class BillController {
	int pageSize = 10;
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	BillService bs = (BillService)ac.getBean("billService");
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request){
		
		ProviderService ps = (ProviderService)ac.getBean("providerService");
		
		String currentPageNo = request.getParameter("currentPageNo");	//当前页
		int totalCount = bs.queryBillNumber();							//总数量
		int totalPageCount = Page.countTotalPage(totalCount, pageSize);	//总页数
		
		//开始前等于空赋值第一页
		if(currentPageNo == "" || currentPageNo == null){
			currentPageNo = "1";
		}
		
		request.setAttribute("providerList", ps.queryAllProvider(0,0));
		request.setAttribute("currentPageNo", currentPageNo);
		request.setAttribute("totalPageCount", totalPageCount);
		request.setAttribute("totalCount", totalCount);
		request.setAttribute("billList", bs.queryAllBill((Integer.valueOf(currentPageNo) - 1) * pageSize, pageSize));
		
		return "bill/billlist";
	}
	
	@RequestMapping(value="/view/{id}", method=RequestMethod.GET)
	public String view(@PathVariable Integer id, HttpServletRequest request){
		System.out.println(id);
		request.setAttribute("bill", bs.queryIdByBill(id));
		return "bill/billview";
	}
}
