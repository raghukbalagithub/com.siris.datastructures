package com.siris.javaconcepts.exceptions;

public class ExceptionsDemo {
  public static void show() {
    Account account = new Account();
    try {
      account.withdraw(10.0F);
    } catch (AccountException e) {
      AccountException cause = (AccountException) e.getCause();
      System.out.println(cause.getMessage());
    }
  }
}
