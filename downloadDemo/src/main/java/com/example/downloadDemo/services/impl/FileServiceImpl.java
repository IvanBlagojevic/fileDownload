package com.example.downloadDemo.services.impl;

import com.example.downloadDemo.models.FileDataDto;
import com.example.downloadDemo.models.VehicleData;
import com.example.downloadDemo.models.enums.FileHeaderEnum;
import com.example.downloadDemo.models.enums.FileTypeEnum;
import com.example.downloadDemo.services.FileService;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static com.example.downloadDemo.utils.FileUtils.formatDateTime;

@Service
public class FileServiceImpl implements FileService {

    @Override
    public File writeToFile(FileDataDto fileData) throws IOException {
        CSVFormat format = getFormat(fileData.getFileType());
        File file = new File(getFileName(format));
        CSVPrinter csvPrinter = getCsvPrinter(fileData, file);
        List<VehicleData> vehicleData = fileData.getVehicleData();
        for (VehicleData data : vehicleData) {
            csvPrinter.printRecord(Arrays.asList(data.getUA(), data.getVehicleID(), data.getLastActiveGroup(), data.getBeginningOdometer(),
                    data.getEndingOdometer(), data.getTotalOdometer(), data.getTotalVehicleMileage(), data.getAL(), data.getAR(), data.getAZ()));
        }
        csvPrinter.flush();
        csvPrinter.close();
        return file;
    }

    private CSVPrinter getCsvPrinter(FileDataDto fileData, File file) throws IOException {
        CSVPrinter csvPrinter = new CSVPrinter(new FileWriter(file), getFormat(fileData.getFileType()));
        csvPrinter.printRecord(FileHeaderEnum.getHeadersList());
        csvPrinter.flush();
        return csvPrinter;
    }

    private String getFileName(CSVFormat format) {
        String extension = CSVFormat.EXCEL.equals(format) ? ".csv" : ".txt";
        StringBuilder builder = new StringBuilder();
        builder.append("report").append("-").append(formatDateTime(new Date())).append(extension);
        return builder.toString();
    }

    private CSVFormat getFormat(String fileType) {
        return isExel(fileType) ? CSVFormat.EXCEL : CSVFormat.DEFAULT;
    }

    private boolean isExel(String fileType) {
        return FileTypeEnum.EXEL.name().equals(fileType.toUpperCase());
    }


}
