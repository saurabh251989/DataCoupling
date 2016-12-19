package com.data.coupling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class XLSService {

	public Map<String, DataSheet> readFromExcel(String file) throws IOException {
		HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(file));
		HSSFSheet myExcelSheet = myExcelBook.getSheet("Data Coupling");

		Iterator<Row> it = myExcelSheet.iterator();
		boolean flag = true;

		Map<String, DataSheet> lDataSheet = new HashMap<String, DataSheet>();

		while (it.hasNext()) {
			Row row = null;
			if (flag) {

				row = it.next();
				flag = false;
				continue;
			} else {
				row = it.next();
			}

			DataSheet dataSheet = new DataSheet();

			String globalVariable = null, temp = null;
			String[] accessedFileName = null;
			String[] accessedTSCname = null;
			String[] accessedTestCaseNO = null;
			String[] modifiedFileName = null;
			String[] remark = null, modifiedTestCaseNO = null, modifiedTSCname = null;

			if (row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				globalVariable = row.getCell(0).getStringCellValue();
				dataSheet.setGlobalVariable(globalVariable.replace(" ", ""));
			}

			if (row.getCell(3).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				temp = row.getCell(3).getStringCellValue();

				if (temp != null) {
					accessedFileName = temp.split("\n");

					dataSheet.setAccessedFileName(accessedFileName);
				}

			}
			if (row.getCell(4).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				temp = row.getCell(4).getStringCellValue();

				if (temp != null) {
					accessedTSCname = temp.split("\n");

					dataSheet.setAccessedTSCname(accessedTSCname);
				}

			}
			if (row.getCell(5).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				temp = row.getCell(5).getStringCellValue();

				if (temp != null) {
					accessedTestCaseNO = temp.split("\n");

					dataSheet.setAccessedTestCaseNO(accessedTestCaseNO);
				}

			}

			if (row.getCell(6).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				temp = row.getCell(6).getStringCellValue();

				if (temp != null) {
					modifiedFileName = temp.split("\n");

					dataSheet.setModifiedFileName(modifiedFileName);
				}

			}
			if (row.getCell(7).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				temp = row.getCell(7).getStringCellValue();

				if (temp != null) {
					modifiedTSCname = temp.split("\n");

					dataSheet.setModifiedTSCname(modifiedTSCname);
				}

			}
			if (row.getCell(8).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				temp = row.getCell(8).getStringCellValue();

				if (temp != null) {
					modifiedTestCaseNO = temp.split("\n");

					dataSheet.setModifiedTestCaseNO(modifiedTestCaseNO);
				}

			}

			if (row.getCell(9).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				temp = row.getCell(9).getStringCellValue();

				if (temp != null) {
					remark = temp.split("\n");

					dataSheet.setRemark(remark);
				}

			}

			lDataSheet.put(dataSheet.getGlobalVariable(), dataSheet);

		}

		myExcelBook.close();
		return lDataSheet;
	}

	public Map<String, DataSheet> readOutputExcel(String file) throws IOException {
		HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(file));
		HSSFSheet myExcelSheet = myExcelBook.getSheet("Data Coupling");

		Iterator<Row> it = myExcelSheet.iterator();
		boolean flag = true;

		Map<String, DataSheet> lDataSheet = new HashMap<String, DataSheet>();

		while (it.hasNext()) {
			Row row = null;
			if (flag) {

				row = it.next();
				flag = false;
				continue;
			} else {
				row = it.next();
			}

			DataSheet dataSheet = new DataSheet();

			String globalVariable = null, temp = null;
			String[] accessedFileName = null;
			String[] accessedTSCname = null;
			String[] accessedTestCaseNO = null;
			String[] modifiedFileName = null;
			String[] remark = null, modifiedTestCaseNO = null, modifiedTSCname = null;

			if (row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				globalVariable = row.getCell(0).getStringCellValue();
				dataSheet.setGlobalVariable(globalVariable.replace(" ", ""));
			}

			if (row.getCell(1).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				temp = row.getCell(1).getStringCellValue();

				if (temp != null) {
					accessedFileName = temp.split("\n");
//					System.out.println("*****");
//
//for (int i = 0; i < accessedFileName.length; i++) {
//	
//	System.out.println(accessedFileName[i]);
//	
//}
//System.out.println("@@@@@@@@@@@@@@@@@@@@@2");
//
//accessedFileName=getArray(accessedFileName);
//for (int i = 0; i < accessedFileName.length; i++) {
//	
//	System.out.println(accessedFileName[i]);
//	
//}			
					dataSheet.setAccessedFileName(getArray(accessedFileName));
				}

			}
			if (row.getCell(2).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				temp = row.getCell(2).getStringCellValue();

				if (temp != null) {
					accessedTSCname = temp.split("\n");

					dataSheet.setAccessedTSCname(getArray(accessedTSCname));
				}

			}
			if (row.getCell(3).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				temp = row.getCell(3).getStringCellValue();

				if (temp != null) {
					accessedTestCaseNO = temp.split("\n");

					dataSheet.setAccessedTestCaseNO(getArray(accessedTestCaseNO));
				}

			}

			if (row.getCell(4).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				temp = row.getCell(4).getStringCellValue();

				if (temp != null) {
					modifiedFileName = temp.split("\n");

					dataSheet.setModifiedFileName(getArray(modifiedFileName));
				}

			}
			if (row.getCell(5).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				temp = row.getCell(5).getStringCellValue();

				if (temp != null) {
					modifiedTSCname = temp.split("\n");

					dataSheet.setModifiedTSCname(getArray(modifiedTSCname));
				}

			}
			if (row.getCell(6).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				temp = row.getCell(6).getStringCellValue();

				if (temp != null) {
					modifiedTestCaseNO = temp.split("\n");

					dataSheet.setModifiedTestCaseNO(getArray(modifiedTestCaseNO));
				}

			}

			if (row.getCell(7).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				temp = row.getCell(7).getStringCellValue();

				if (temp != null) {
					remark = temp.split("\n");

					dataSheet.setRemark(getArray(remark));
				}

			}

			lDataSheet.put(dataSheet.getGlobalVariable(), dataSheet);

		}

		myExcelBook.close();
		return lDataSheet;
	}

	public void writeIntoExcel(String file, Map<String, DataSheet> lDataSheet) throws IOException {
		HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(file));
		HSSFSheet myExcelSheet = myExcelBook.getSheet("Data Coupling");

		Iterator<Row> it = myExcelSheet.iterator();
		boolean flag = true;

		while (it.hasNext()) {
			Row row = null;
			if (flag) {

				row = it.next();
				flag = false;
				continue;
			} else {
				row = it.next();
			}

			String globalVariable = null;
			String[] temp = null;

			if (row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING) {
				globalVariable = row.getCell(0).getStringCellValue();
				String cellValue = null;
				DataSheet dataSheet = lDataSheet.get(globalVariable);
				if (dataSheet != null) {
					cellValue = row.getCell(2).getStringCellValue();
					if (cellValue == null) {

						cellValue = "";
					}

					temp = dataSheet.getAccessedTSCname();
					for (int i = 0; temp != null && i < temp.length; i++) {

						cellValue = cellValue + "\n" + temp[i];
					}
					if (!cellValue.isEmpty()) {
						row.getCell(2).setCellValue(cellValue);
					}
					cellValue = row.getCell(3).getStringCellValue();
					if (cellValue == null) {

						cellValue = "";
					}

					temp = dataSheet.getAccessedTestCaseNO();
					for (int i = 0; temp != null && i < temp.length; i++) {

						cellValue = cellValue + "\n" + temp[i];
					}
					if (!cellValue.isEmpty()) {
						row.getCell(3).setCellValue(cellValue);
					}

					cellValue = row.getCell(5).getStringCellValue();
					if (cellValue == null) {

						cellValue = "";
					}

					temp = dataSheet.getModifiedTSCname();
					for (int i = 0; temp != null && i < temp.length; i++) {

						cellValue = cellValue + "\n" + temp[i];
					}
					if (!cellValue.isEmpty()) {
						row.getCell(5).setCellValue(cellValue);
					}

					cellValue = row.getCell(6).getStringCellValue();
					if (cellValue == null) {

						cellValue = "";
					}

					temp = dataSheet.getModifiedTestCaseNO();
					for (int i = 0; temp != null && i < temp.length; i++) {

						cellValue = cellValue + "\n" + temp[i];
					}
					if (!cellValue.isEmpty()) {
						row.getCell(6).setCellValue(cellValue);
					}

					cellValue = row.getCell(7).getStringCellValue();
					if (cellValue == null) {

						cellValue = "";
					}

					temp = dataSheet.getRemark();
					for (int i = 0; temp != null && i < temp.length; i++) {

						cellValue = cellValue + "\n" + temp[i];
					}
					if (!cellValue.isEmpty()) {
						row.getCell(7).setCellValue(cellValue);
					}
				}
			}

		}

		FileOutputStream output_file = new FileOutputStream(new File(file));
		myExcelBook.write(output_file);

		output_file.close();

		myExcelBook.close();
	}

	public void writeCommentIntoExcel(String file, Map<String, Validation> lDataSheet) throws IOException {
		HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(file));
		HSSFSheet myExcelSheet = myExcelBook.getSheet("Data Coupling");
		Iterator<Row> it = myExcelSheet.iterator();
		boolean flag = true;

		while (it.hasNext()) {
			Row row = null;
			if (flag) {

				row = it.next();
				Cell cell = row.createCell(8);
				cell.setCellStyle(row.getCell(0).getCellStyle());
				
				cell.setCellValue("Access Comment");
				Cell cell1 = row.createCell(9);
				cell1.setCellValue("Modified Comment");
				myExcelSheet.autoSizeColumn(8);
				myExcelSheet.autoSizeColumn(9);
				cell1.setCellStyle(row.getCell(0).getCellStyle());
				
				flag = false;
				continue;
			} else {
				row = it.next();

				String globalVariable = null;
				String[] temp = null;

				if (row.getCell(0).getCellType() == HSSFCell.CELL_TYPE_STRING) {
					globalVariable = row.getCell(0).getStringCellValue();
					Cell cell = row.createCell(8);
					Cell cell1 = row.createCell(9);

					String cellValue = null;
					Validation dataSheet = lDataSheet.get(globalVariable);
					if (dataSheet != null) {
						cellValue = row.getCell(8).getStringCellValue();

						temp = dataSheet.getCommentAccess();
						for (int i = 0; temp != null && i < temp.length; i++) {
							if (temp[i] != null)
								cellValue = cellValue + "\n" + temp[i];
						}
						if (!cellValue.isEmpty()) {
							cell.setCellValue(cellValue);
						}

						cellValue = row.getCell(9).getStringCellValue();

						temp = dataSheet.getCommentModified();
						for (int i = 0; temp != null && i < temp.length; i++) {
							if (temp[i] != null)
								cellValue = cellValue + "\n" + temp[i];
						}
						if (!cellValue.isEmpty()) {
							cell1.setCellValue(cellValue);
						}

					}
				}
			}
		}

		FileOutputStream output_file = new FileOutputStream(new File(file));
		myExcelBook.write(output_file);

		output_file.close();

		myExcelBook.close();
	}

	String[] getArray(String[] array) {
		List<String> list = new ArrayList<String>();
		if (array != null) {
			for (String s : array) {

				if (s != null && s.length() > 0) {
					list.add(s.trim());
				}
			}



			return list.toArray(new String[list.size()]);

		} else
			return null;
	}

}
