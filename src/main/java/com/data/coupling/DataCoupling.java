package com.data.coupling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author saurabh.k
 *
 */
public class DataCoupling {
	public static void main(String[] args) throws IOException {
		XLSService xs = new XLSService();

		try {
			Files.walk(Paths.get("Input")).forEach(filePath -> {

				if (Files.isRegularFile(filePath) && (filePath.getFileName().toString().endsWith(".xls"))) {
					try {

						Map<String, DataSheet> lDataSheet = xs.readFromExcel(filePath.toString());
						xs.writeIntoExcel("Output\\Data_Coupling.xls", lDataSheet);

					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			});
		} catch (IOException e) {
			e.printStackTrace();
		}

		Map<String, DataSheet> lDataSheet=xs.readOutputExcel("Output\\Data_Coupling.xls");
		
		Map<String, Validation> lDataSheetComment=new HashMap<String, Validation>();
		for (Map.Entry<String, DataSheet> entry : lDataSheet.entrySet()) {
			String key = entry.getKey();
			
			
	     	Validation validation = Check.getComment(key, entry.getValue());
	     	lDataSheetComment.put(key, validation);
		}
		xs.writeCommentIntoExcel("Output\\Data_Coupling.xls", lDataSheetComment);

		
	}
}
