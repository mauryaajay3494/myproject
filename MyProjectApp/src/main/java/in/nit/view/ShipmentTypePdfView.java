package in.nit.view;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

import in.nit.model.ShipmentType;

public class ShipmentTypePdfView extends AbstractPdfView {
	@SuppressWarnings("unchecked")
	protected void buildPdfDocument(Map<String, Object> model, 
			Document document, 
			PdfWriter writer,
			HttpServletRequest request, 
			HttpServletResponse response) throws Exception {
		//downLoad file
		response.addHeader("Content-Disposition","attachment;filename=shipments.pdf");
		//create element
		Paragraph p=new Paragraph("Welcome to ShipmentType");
		//add element to document
		document.add(p);
		//reade data from Model
		List<ShipmentType>List=(List<ShipmentType>)model.get("list");
		//creating table with no of columns
		PdfPTable t=new PdfPTable(6);
		t.addCell("ID");
		t.addCell("CODE");
		t.addCell("GRADE");
		t.addCell("MODE");
		t.addCell("ENABLE");
		t.addCell("NOTE");
		//adding data to table
		for(ShipmentType st:List) {
			
			t.addCell(st.getShipId().toString());
			t.addCell(st.getShipmode());
			t.addCell(st.getShipcode());
			t.addCell(st.getEnbShip());
			t.addCell(st.getShipGrad());
			t.addCell(st.getShipDesc());
			
		}
		//add table to document
		document.add(t);
		//print data and time
		document.add(new Paragraph(new Date().toString()));
	}

	
}


