
package com.jantaclinic.bean;

public class UpdatePatient 
{
    private String  Patients_id;
    private String name;
    private String message;
    private String prescription;

    public UpdatePatient(String Patients_id, String name, String message, String prescription) {
        this.Patients_id = Patients_id;
        this.name = name;
        this.message = message;
        this.prescription = prescription;
    }

    public UpdatePatient() {
    }

    public String getPatients_id() {
        return Patients_id;
    }

    public void setPatients_id(String Patients_id) {
        this.Patients_id = Patients_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    
    
}
