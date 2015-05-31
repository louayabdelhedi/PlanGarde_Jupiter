package edu.iit.garde;

import java.io.File;
import java.util.HashMap;
import java.util.Map.Entry;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

class ReportXSL {

	public void reportExcel(HashMap<String, String> map) throws Exception {

		WritableWorkbook wworkbook = Workbook.createWorkbook(new File(
				"Planing.xls"));
		WritableSheet wsheet = wworkbook.createSheet("First Sheet", 0);

		Label l1 = new Label(0, 0, "date");
		Label l2 = new Label(1, 0, "Name");
		wsheet.addCell(l1);
		wsheet.addCell(l2);

		int i = 1;
		for (Entry<String, String> entry : map.entrySet()) {
			Label lbl1 = new Label(0, i, entry.getKey().toString());
			Label lbl2 = new Label(1, i, entry.getValue());
			i++;
			wsheet.addCell(lbl1);
			wsheet.addCell(lbl2);
		}
		wworkbook.write();
		wworkbook.close();
	}
}