package in.nit.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import in.nit.model.PurchaseOrder;


public class PurchaseOrderExcelView extends AbstractXlsxView {

	@SuppressWarnings("unchecked")
	protected void buildExcelDocument(
			Map<String,Object> model,
			Workbook workbook,
			HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//Filename
		response.addHeader(
				"Content-Disposition",
				"attachment;filename=purchase.xlsx");
		Sheet s= workbook.createSheet("Purchase Order");
		//Construct row-0
		setHeader(s);
		//read Model Data
		List<PurchaseOrder> list=(List<PurchaseOrder>)model.get("list");
		setBody(s,list);
	}
	
	private void setHeader(Sheet s) {
		Row r=s.createRow(0);
		r.createCell(0).setCellValue("ID");
		r.createCell(1).setCellValue("CODE");
		r.createCell(2).setCellValue("SHIPMENT TYPE");
		r.createCell(3).setCellValue("WHUSER TYPE");
		r.createCell(4).setCellValue("REF.NUMBER");
		r.createCell(5).setCellValue("QUALITY CHECK");
		r.createCell(6).setCellValue("DEFAULT STATUS");
		r.createCell(7).setCellValue("NOTE");
	}
	
	@SuppressWarnings("unused")
	private void setBody(Sheet s,List<PurchaseOrder> list) {
		int count=1;
		for(PurchaseOrder st:list) {
			Row r=s.createRow(count++);
			r.createCell(0).setCellValue(st.getOrdId().toString());
			r.createCell(1).setCellValue(st.getOrdCode());
			r.createCell(2).setCellValue(st.getShipOb().getShipcode());
			r.createCell(3).setCellValue(st.getWhuserOb().getUserCode());
			r.createCell(4).setCellValue(st.getRefNumber());
			r.createCell(5).setCellValue(st.getQuaCheck());
			r.createCell(6).setCellValue(st.getDefStatus());
			r.createCell(7).setCellValue(st.getOrdDesc());
		}
	}

	
}
