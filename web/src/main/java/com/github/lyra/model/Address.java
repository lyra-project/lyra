package com.github.lyra.model;

public class Address {
  private String street;
  private String country;
  private String city;
  private String postalCode;
  private double latitude;
  private double longitude;

  public Address(
      String street,
      String country,
      String city,
      String postalCode,
      double latitude,
      double longitude) {
    this.street = street;
    this.country = country;
    this.city = city;
    this.postalCode = postalCode;
    this.latitude = latitude;
    this.longitude = longitude;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

}
