package com.java.practice.examples;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Employee 
{ 
  private String name; 
  private int id; 
  private String nCompany; 
 
  Employee(String name, int id, String nCompany)
  { 
    this.id = id; 
    this.name = name; 
    this.nCompany = nCompany; 
  } 
   
} 