package org.example;

import java.util.Objects;

public class Employee {

  private String firstName;
  private String lastName;
  private long mobileNo;

  public Employee() {
  }

  public Employee(String firstName, String lastName, long mobileNo) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.mobileNo = mobileNo;
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

  public long getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(long mobileNo) {
    this.mobileNo = mobileNo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return mobileNo == employee.mobileNo && Objects.equals(firstName, employee.firstName)
        && Objects.equals(lastName, employee.lastName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, mobileNo);
  }
}
