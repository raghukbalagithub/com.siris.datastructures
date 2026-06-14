package java_concepts.exceptions;

public class AccountException extends Exception {
  public AccountException(Exception cause) {
    super(cause);
  }
}
