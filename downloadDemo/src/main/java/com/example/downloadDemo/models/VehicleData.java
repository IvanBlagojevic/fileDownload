package com.example.downloadDemo.models;

public class VehicleData {

    private String UA;
    private String vehicleID;
    private String lastActiveGroup;
    private String beginningOdometer;
    private String endingOdometer;
    private String totalOdometer;
    private String totalVehicleMileage;
    private String AL;
    private String AR;
    private String AZ;

    public VehicleData(String UA, String vehicleID, String lastActiveGroup, String beginningOdometer,
                       String endingOdometer, String totalOdometer, String totalVehicleMileage, String AL, String AR, String AZ) {
        this.UA = UA;
        this.vehicleID = vehicleID;
        this.lastActiveGroup = lastActiveGroup;
        this.beginningOdometer = beginningOdometer;
        this.endingOdometer = endingOdometer;
        this.totalOdometer = totalOdometer;
        this.totalVehicleMileage = totalVehicleMileage;
        this.AL = AL;
        this.AR = AR;
        this.AZ = AZ;
    }

    public VehicleData() {
    }

    public String getUA() {
        return UA;
    }

    public void setUA(String UA) {
        this.UA = UA;
    }

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getLastActiveGroup() {
        return lastActiveGroup;
    }

    public void setLastActiveGroup(String lastActiveGroup) {
        this.lastActiveGroup = lastActiveGroup;
    }

    public String getBeginningOdometer() {
        return beginningOdometer;
    }

    public void setBeginningOdometer(String beginningOdometer) {
        this.beginningOdometer = beginningOdometer;
    }

    public String getEndingOdometer() {
        return endingOdometer;
    }

    public void setEndingOdometer(String endingOdometer) {
        this.endingOdometer = endingOdometer;
    }

    public String getTotalOdometer() {
        return totalOdometer;
    }

    public void setTotalOdometer(String totalOdometer) {
        this.totalOdometer = totalOdometer;
    }

    public String getTotalVehicleMileage() {
        return totalVehicleMileage;
    }

    public void setTotalVehicleMileage(String totalVehicleMileage) {
        this.totalVehicleMileage = totalVehicleMileage;
    }

    public String getAL() {
        return AL;
    }

    public void setAL(String AL) {
        this.AL = AL;
    }

    public String getAR() {
        return AR;
    }

    public void setAR(String AR) {
        this.AR = AR;
    }

    public String getAZ() {
        return AZ;
    }

    public void setAZ(String AZ) {
        this.AZ = AZ;
    }

    @Override
    public String toString() {
        String comma = ",";
        StringBuilder builder = new StringBuilder();
        builder.append(UA).append(comma).append(vehicleID).append(comma).append(lastActiveGroup).append(comma)
                .append(beginningOdometer).append(comma).append(endingOdometer).append(comma).append(totalOdometer).append(comma)
                .append(totalVehicleMileage).append(comma).append(AL).append(comma).append(AR).append(comma).append(AZ);
        return builder.toString();

    }
}
