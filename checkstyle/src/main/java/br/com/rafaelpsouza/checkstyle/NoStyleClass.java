package br.com.rafaelpsouza.checkstyle;

/**
 * Created by Rafael Souza on 08/02/18.
 */
public class NoStyleClass {

  public static void main(String[] args) {


    System.out.println("So many empty lines before: JavadocMethod");
  }


  public void test(){
    String test = "missing whitespace";
  }

  public void id() {
      System.out.println("Wrong identation");
  }

}
