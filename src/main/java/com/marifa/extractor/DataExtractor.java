package com.marifa.extractor;

import com.marifa.discovery.FindSimilarResource;
import org.apache.poi.hssf.usermodel.HSSFSheet;

/**
 * Created by AHMED on 1/10/2016.
 */
public class DataExtractor {

    private static HSSFSheet sheet;
    public static void main(String Args[]){
        /*ParseExcelFile parseExcelFile = new ParseExcelFile();
        sheet = parseExcelFile.getSheet();
        Iterator<Row> rows = sheet.rowIterator();
        while (rows.hasNext()){
            Row row = rows.next();
            Iterator<Cell> cells = row.cellIterator();
            while (cells.hasNext()){
                Cell cell = cells.next();
                switch (cell.getCellType()){
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "|");
                        break;
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue() + "|");
                        break;
                }
                System.out.print(" ");
            }
            System.out.println("");
        }*/
        new FindSimilarResource();
    }

}
