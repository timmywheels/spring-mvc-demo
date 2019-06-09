package com.timwheeler.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private String programmingLanguage;
    private LinkedHashMap<String, String> programmingLanguages;
    private String[] operatingSystems;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("USA", "United States");
        countryOptions.put("DEU", "Germany");
        countryOptions.put("ITA", "Italy");
        countryOptions.put("FRA", "France");

        programmingLanguages = new LinkedHashMap<>();
        programmingLanguages.put("Java", "Java");
        programmingLanguages.put("JavaScript", "JavaScript");
        programmingLanguages.put("Python", "Python");
        programmingLanguages.put("C#", "C#");
        programmingLanguages.put("Ruby", "Ruby");

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public LinkedHashMap<String, String> getProgrammingLanguages() {
        return programmingLanguages;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

}
