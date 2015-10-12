package com.aspose.cells.cloud.examples.pivottables;

import com.aspose.cells.cloud.examples.Common;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class DeleteWorksheetPivotTableIndex {

    public static void main(String... args) throws IOException {
        String input = "sample1.xlsx";
        Path inputFile = Common.getPath(DeleteWorksheetPivotTableIndex.class, input);
        
        String output = "sample2.xlsx";
        Path outputFile = Common.getPath(DeleteWorksheetPivotTableIndex.class, output);
        
        Integer pivotTableIndex = 0;
        String sheetName="Sheet1";
                
        Common.getStorageSdk().PutCreate(
                input,
                null,
                null,
                inputFile.toFile()
        );

        Common.getCellsSdk().DeleteWorksheetPivotTable(
                    input,
                    sheetName,
                    pivotTableIndex,
                    null,
                    null
        );
        
        com.aspose.storage.model.ResponseMessage sr = Common.getStorageSdk().GetDownload(
                input,
                null,
                Common.STORAGE
        );

        Files.copy(sr.getInputStream(), outputFile, StandardCopyOption.REPLACE_EXISTING);
        
    }

}