package edu.iit.garde;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;

import edu.iit.garde.*;

import org.junit.Test;

public class ReportTxtTest {

	@Test
	public void test() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("   Date   ", "     Name     ");
		map.put("08/09/2015", "tawfik mdhafer");
		map.put("06/06/2015", "Ahmad Bouarada");
		map.put("20/05/2015", "Mohamed Maalej");
		map.put("31/05/2015", "loay Abdelhadi");
		ReportTxt rt = new ReportTxt();
		try {
			rt.reporttxt(map);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
