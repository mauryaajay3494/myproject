package in.nit.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nit.service.IOrderService;
import in.nit.util.OrderMethodUtil;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private IOrderService service;
	@Autowired
	private ServletContext context;
	@Autowired
	private OrderMethodUtil util;
	
	@RequestMapping("/charts")
	public String showCharts() {
		List<Object[]> list=service.getOrderTypeCount();
		String path=context.getRealPath("/");
		util.generatePie(path,list);
		util.generateBar(path,list);
		return "OrderMethodCharts";
	}

}
