package com.example.downloadDemo.models;

import java.util.List;

public class FileDataDto {

    private String fileType;
    List<VehicleData> vehicleData;

    public FileDataDto() {
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public List<VehicleData> getVehicleData() {
        return vehicleData;
    }

    public void setVehicleData(List<VehicleData> vehicleData) {
        this.vehicleData = vehicleData;
    }
}
