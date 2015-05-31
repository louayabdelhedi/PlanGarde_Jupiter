package edu.iit.garde;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class ReportXSLTest {

	@Test
	public void test() {


		 HashMap<String, String> map = new HashMap<String, String>();
		map.put("08/09/2015", "tawfik mdhafer");
		map.put("06/06/2015", "Ahmad Bouarada");
		map.put("20/05/2015", "Mohamed Maalej");
		map.put("31/05/2015", "loay Abdelhadi");
	        ReportXSL rS=new ReportXSL();
	        try {
				rS.reportExcel(map);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
