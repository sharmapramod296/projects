
package com.jantaclinic.bean;

public class AppointmentData 
{
    private String Patients_id;
    private String name;
    private String email;
    private String contact;
    private String message;
    private String photo;
    private String clinic;
    private String date;

   
    public AppointmentData() {
    }

    public AppointmentData(String Patients_id, String name, String email, String contact, String message, String photo, String clinic, String date) {
        this.Patients_id = Patients_id;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.message = message;
        this.photo = photo;
        this.clinic = clinic;
        this.date = date;
    }

   

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getClinic() {
        return clinic;
    }

    public void setClinic(String clinic) {
        this.clinic = clinic;
    }

    public String getPatients_id() {
        return Patients_id;
    }

    public void setPatients_id(String Patients_id) {
        this.Patients_id = Patients_id;
    }
    
    
}
