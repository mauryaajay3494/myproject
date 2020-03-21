package in.nit.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.nit.model.ShipmentType;
import in.nit.service.IShipmentTypeService;
import in.nit.view.ShipmentTypeExcelView;
import in.nit.view.ShipmentTypePdfView;

@Controller
@RequestMapping("/shipment")
public class ShipmentTypeController {

	@Autowired
	private IShipmentTypeService service;

	/**
	 * 1. This method is used to display Shipment Type Register Page on
	 * URL:/register,GET
	 */
	/*
	 * method formate public String<anyMethodName>(){ return "PageName"; }
	 */
	@RequestMapping("/register") // GET
	public String showRegPage() {

		return "ShipmentTypeRegister";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveShipment(@ModelAttribute ShipmentType shipmentType, Model model) {

		Integer id = service.saveShipmentType(shipmentType);

		String message = "ShipmentType '" + id + "' saved";

		model.addAttribute("message", message);

		return "ShipmentTypeRegister";
	}

	@RequestMapping("/all")
	public String getAllShipmentTypes(Model model) {
		List<ShipmentType> list = service.getAllShipmentTypes();
		model.addAttribute("list", list);
		return "ShipmentTypeData";
	}

	@RequestMapping("/delete")
	public String deleteShipment(@RequestParam("sid") Integer id, Model model) {
		service.deleteShipmentType(id);
		String message = "Shipment'" + id + "'delete";

		model.addAttribute("message", message);

		// ---fetch new data---
		List<ShipmentType> list = service.getAllShipmentTypes();
		model.addAttribute("list", list);
		return "ShipmentTypeData"; // pageName
	}

	@RequestMapping("/edit")
	public String showEditPage(@RequestParam("sid") Integer id, Model model) {
		ShipmentType st = service.getOneShipmentType(id);
		model.addAttribute("shipmentType", st);
		return "ShipmentTypeEdit";
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateShipment(@ModelAttribute ShipmentType shipmentType, Model model) {
		service.updateShipmentType(shipmentType);
		String message = "ShipmentType" + shipmentType.getShipId() + "updated";
		model.addAttribute("message", message);
		List<ShipmentType> List = service.getAllShipmentTypes();
		model.addAttribute("list", List);
		return "ShipmentTypeData";

	}

	@RequestMapping("/view")
	public String showOneShipment(@RequestParam("sid") Integer id, Model model) {
		ShipmentType st = service.getOneShipmentType(id);
		model.addAttribute("ob", st);
		return "ShipmentTypeView";
	}

	@RequestMapping("/excel")
	public ModelAndView ShowExcel(@RequestParam(value = "id", required = false) Integer id) {
		ModelAndView m = new ModelAndView();
		m.setView(new ShipmentTypeExcelView());
		if (id == null) {
			// fetching all rows
			List<ShipmentType> list = service.getAllShipmentTypes();
			m.addObject("list", list);
		} else {
			// export one row by ID
			ShipmentType st = service.getOneShipmentType(id);
			m.addObject("list", Arrays.asList(st));
		}
		return m;
	}

	@RequestMapping("/pdf")
	public ModelAndView ShowPdf(@RequestParam(value = "id", required = false) Integer id) {
		ModelAndView m = new ModelAndView();
		m.setView(new ShipmentTypePdfView());
		if (id == null) {
			// fetching all rows
			List<ShipmentType> list = service.getAllShipmentTypes();
			m.addObject("list", list);
		} else {
			// export one row by ID
			ShipmentType st = service.getOneShipmentType(id);
			m.addObject("list", Arrays.asList(st));
		}
		return m;
	}
}
