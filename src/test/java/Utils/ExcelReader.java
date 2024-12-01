package Utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static List<Map<String, String>> readExcel(String path, String sheetName) {

        List<Map<String, String>> excelData = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fis);
            Sheet sheet = xssfWorkbook.getSheet(sheetName);

            int actualNoOfRowsWithData = sheet.getPhysicalNumberOfRows();
            Row headerRow = sheet.getRow(0);

            for (int i = 0; i < actualNoOfRowsWithData; i++) {
                Row currentRow = sheet.getRow(i);
                Map<String, String> rowMap = new LinkedHashMap<>();

                int actualNoOfCellsWithData = currentRow.getPhysicalNumberOfCells();
                for (int j = 0; j < actualNoOfCellsWithData; j++) {

                    String key = headerRow.getCell(j).toString();
                    String value = currentRow.getCell(j).toString();
                    rowMap.put(key, value);

                }
                excelData.add(rowMap);
            }

        } catch (IOException ioException) {
            throw new RuntimeException("failed to load excel file" + ioException.getMessage(), ioException);
        }

        return excelData;
    }

    public static List<Map<String, String>> readExcel(String sheetName) {
        return readExcel(Constants.EXCEL_FILE_PATH, sheetName);
    }

    public static List<Map<String,String>> readExcel(){
        return readExcel(Constants.EXCEL_FILE_PATH, "Sheet1");
    }
}
