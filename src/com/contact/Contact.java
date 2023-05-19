package com.contact;

import java.util.Scanner;

public class Contact {
     int id;
    private String name;
    private String company;
    private String email;
    private String phone;

    public Contact(String name, String company, String email, String phone) {
        this.name = name;
        this.company = company;
        this.email = email;
        this.phone = phone;
    }

    public Contact() {

    }

    public Contact(int id, String name, String company, String email, String phone) {
        this.id = id;
        this.name=name;
        this.company=company;
        this.email=email;
        this.phone= phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void inputData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Name:");
        this.name = input.nextLine();
        System.out.print("Enter Company:");
        this.company = input.nextLine();
        System.out.print("Enter Email:");
        this.email = input.nextLine();
        System.out.print("Enter Phone:");
        this.phone = input.nextLine();
    }

    @Override
    public String toString() {
        return "Contact{" + "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }


}
