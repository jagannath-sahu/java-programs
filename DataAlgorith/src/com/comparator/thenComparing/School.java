package com.comparator.thenComparing;

public class School implements Comparable<School> {
  private String sname;
  private String city;

  public School(String sname, String city) {
    this.sname = sname;
    this.city = city;
  }

  public String getSname() {
    return sname;
  }

  public String getCity() {
    return city;
  }

  @Override
  public int compareTo(School s) {
    return s.getCity().compareTo(city);
  }
}
