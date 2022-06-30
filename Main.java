/*
File Name: main.java
Name: Amar Panjwani
Description: This program reimplements the CashRegister class and adds a method displayAll that displays the prices of all items in the current sale.
Date: 04/25/21
Email: panjwania@student.vvc.edu
*/

import java.util.ArrayList;

class Main 
{
  public static void main(String[] args) 
  {
    CashRegister register1 = new CashRegister();
    register1.clear();
    register1.addItem(2156);
    register1.addItem(1756);
    register1.addItem(3156);
    register1.addItem(7856);
    register1.addItem(103456);
    register1.addItem(4516);
    register1.addItem(8324);
    System.out.println(register1.displayAll());
    System.out.println(register1.getTotal());
  }
}

  
  