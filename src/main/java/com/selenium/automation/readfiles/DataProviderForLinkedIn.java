package com.selenium.automation.readfiles;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.util.Iterator;

public class DataProviderForLinkedIn {

    @DataProvider(name = "test data")
    public Object[][] getData() throws IOException, InvalidFormatException {
        ExcelFile excelFile = new ExcelFile();
        int totalRows = excelFile.getNoOfRows();
        Object[][] values = new Object[totalRows][2];
        for(int i = 0; i < totalRows; i++){
            for(int j = 0; j < 2; j++){
                values[i][0] = excelFile.getData(i,0);
                values[i][1] = excelFile.getData(i,1);

            }

        }


        return values;
    }
}