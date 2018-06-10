package fileRead;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

	ArrayList<ArrayList<Object>> rows = new ArrayList<ArrayList<Object>>();

	public void read() {
		// OS separator

		String slash = File.separator;
		// path to the file
		File file = new File(
				"C:" + slash + "Users" + slash + "venci" + slash + "Desktop" + slash + "Log_2015.05.14.dat.txt");
		Scanner sc = null;

		rows = new ArrayList<>();

		try {
			sc = new Scanner(file);
			sc.nextLine();
			while (sc.hasNextLine()) {
				String text;
				text = sc.nextLine();
				String[] arr = text.split(" ");

				ArrayList<Object> parametrs = new ArrayList<Object>();
				int j = 0;
				for (int i = 0; i < arr.length; i++) {

					if (!arr[j].trim().equals("")) {
						parametrs.add(arr[j]);

					}
					j++;
					// int year = Integer.parseInt(arr[j++]);
					// int mongth = Integer.parseInt(arr[j++]);
					// int day = Integer.parseInt(arr[j++]);
					// int hour = Integer.parseInt(arr[j++]);
					// int minute = Integer.parseInt(arr[j++]);
					// double second = Double.parseDouble(arr[j++]);
					// double uBat = Double.parseDouble(arr[j++]);
					// double iBat = Double.parseDouble(arr[j++]);
					// double uBatMin = Double.parseDouble(arr[j++]);
					// double uIn = Double.parseDouble(arr[j++]);
					// double iIn = Double.parseDouble(arr[j++]);
					// double pOut = Double.parseDouble(arr[j++]);
					// double pOutMax = Double.parseDouble(arr[j++]);
					// double fOut = Double.parseDouble(arr[j++]);
					// double fIn = Double.parseDouble(arr[j++]);
					// double pInA = Double.parseDouble(arr[j++]);
					// double pOutA = Double.parseDouble(arr[j++]);
					// double tElec1 = Double.parseDouble(arr[j++]);
					// double BSPUBat = Double.parseDouble(arr[j++]);
					// double BSPIBat = Double.parseDouble(arr[j++]);
					// double BSPSOC = Double.parseDouble(arr[j++]);
					// double BSPTBat = Double.parseDouble(arr[j++]);
					// double XCOMMSPout = Double.parseDouble(arr[j++]);
					// double UBatOND = Double.parseDouble(arr[j++]);

				}
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				rows.add(parametrs);

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List getList() {
		return rows;
	}

}
