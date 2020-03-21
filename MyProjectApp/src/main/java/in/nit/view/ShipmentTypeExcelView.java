package in.nit.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsxView;

import in.nit.model.ShipmentType;

public class ShipmentTypeExcelView extends AbstractXlsxView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// file Name
		response.addHeader("Context-Disposition","attachment;filename=shipment.xlsx");
		Sheet s =workbook.createSheet("SHIPMENTTYPE");
		//Construct-row-o
		SetHeader(s);
		//read model data
		@SuppressWarnings("unchecked")
		List<ShipmentType>List=(List<ShipmentType>)model.get("list");
		SetBody(s,List);
		

	}

	private void SetHeader(Sheet s) {
		Row r=s.createRow(0);
		r.createCell(0).setCellValue("ID");
		r.createCell(1).setCellValue("MODE");
		r.createCell(2).setCellValue("CODE");
		r.createCell(3).setCellValue("ENABLE");
		r.createCell(4).setCellValue("GRADE");
		r.createCell(5).setCellValue("NOTE");
		
		
	}

	private void SetBody(Sheet s, List<ShipmentType> list) {
		int count=1;
		for(ShipmentType st:list) {
			Row r=s.createRow(count++);
			r.createCell(0).setCellValue(st.getShipId());
			r.createCell(1).setCellValue(st.getShipmode());
			r.createCell(2).setCellValue(st.getShipcode());
			r.createCell(3).setCellValue(st.getShipGrad());
			r.createCell(4).setCellValue(st.getShipDesc());
		}
		
	}

}
