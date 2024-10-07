package com.pluralsight;

public class CellPhone {

    // fields
    int serialNumber;
    String cellPhoneModel;
    String phoneCarrier;
    String phoneNumber;
    String phoneOwner;

    // constructor
    public CellPhone(int _serialNumber, String _cellPhoneModel, String _phoneCarrier, String _phoneNumber, String _phoneOwner){
        System.out.println();
        this.serialNumber = _serialNumber;
        this.cellPhoneModel = _cellPhoneModel;
        this.phoneCarrier = _phoneCarrier;
        this.phoneNumber = _phoneNumber;
        this.phoneOwner = _phoneOwner;
    }

    public CellPhone() {
        serialNumber = 0;
        cellPhoneModel = "";
        phoneCarrier = "";
        phoneNumber = "";
        phoneOwner = "";
    }

    //setter methods

    public void setSerialNumber(){

    }

    public void setCellPhoneModel(){

    }

    public void setPhoneCarrier(){

    }

    public void setPhoneNumber(){

    }

    public void setPhoneOwner(){

    }

    // getter methods
    public int getSerialNumber() {
        return this.serialNumber;
    }

    public String getCellPhoneModel() {
        return this.cellPhoneModel;
    }

    public String getPhoneCarrier() {
        return this.phoneCarrier;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public String getPhoneOwner(){
        return this.phoneOwner;
    }

    //added dial method
    public String dial (String dialPhoneNumber){
        System.out.println(phoneOwner + "'s phone is calling " + dialPhoneNumber);
        return dialPhoneNumber;
    }

     public void getdialPhoneNumber(String dialPhoneNumber) {
    }

    public void setdialPhoneNumber(String dialPhoneNumber) {
    }


}


