package br.eng.rafaelpsouza.errorprone;

/**
 * Created by Rafael Souza on 16/02/18.
 */
public class MyClass {

  public void deadException() {
    new RuntimeException("Test");
  }

  public void arrayEquals() {
    int[] a = {0, 1};
    int[] b = {0, 1};

    if (a.equals(b)) {
      System.out.println("arrays are equal!");
    } else {
      System.out.println("arrays are not equal!");
    }
  }

  private String convertString(String myString) {
    myString.replaceAll("a", "b");
    return myString;
  }

  public Object test() {
    return null;
  }


}
