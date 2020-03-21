package in.nit.controller;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import in.nit.service.IUomService;
import in.nit.util.UomTypeUtil;

@Controller
@RequestMapping("/unit")
public class UomController {
	
	@Autowired
	private IUomService service;
	@Autowired
	private ServletContext context;
	@Autowired
	private UomTypeUtil util;
	
	@RequestMapping("/charts")
	public String showCharts() {
		List<Object[]> list=service.getUomTypeCount();
		String path=context.getRealPath("/");
		util.generatePie(path,list);
		util.generateBar(path,list);
		return "UomTypeCharts";
	}

}
