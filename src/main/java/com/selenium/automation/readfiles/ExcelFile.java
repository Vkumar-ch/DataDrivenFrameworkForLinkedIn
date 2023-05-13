package com.selenium.automation.readfiles;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFile {

    XSSFWorkbook workbook;
    XSSFSheet sheet;
    int noOfRows;

    public static final String filePath = "C:\\Users\\hp\\IdeaProjects\\DataDrivenFrameworkForLinkedIn\\src\\main\\resources\\Book1.xlsx";

    public ExcelFile() throws IOException, InvalidFormatException ,RuntimeException {
        File file = new File(filePath);
        FileInputStream rw = new FileInputStream(file);
        this.workbook = new XSSFWorkbook(rw);
    }

    public String getData(int row, int column){
        this.sheet = this.workbook.getSheet("Sheet1");
        Cell cell = this.sheet.getRow(row).getCell(column);
        String data = cell.getStringCellValue();
        return data;
    }

    public int getNoOfRows(){
        this.workbook.getSheet("Sheet1").getLastRowNum();
        ++noOfRows;
        return noOfRows;

    }



}
