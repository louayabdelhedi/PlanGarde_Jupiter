package edu.iit.garde;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ReportTxt {
	public void reporttxt(HashMap<String, String> map) throws IOException {

		int recordsToPrint = 100;

		FileWriter fstream;
		BufferedWriter out;

		fstream = new FileWriter("Planing.txt");
		out = new BufferedWriter(fstream);

		int count = 0;

		Iterator<Entry<String, String>> it = map.entrySet().iterator();

		while (it.hasNext() && count < recordsToPrint) {

			Map.Entry<String, String> pairs = it.next();
			System.out.println("Value is " + pairs.getValue());

			out.write(pairs.getKey() + " | " + pairs.getValue() + "\r\n");

			count++;
		}

		out.close();
	}

}
