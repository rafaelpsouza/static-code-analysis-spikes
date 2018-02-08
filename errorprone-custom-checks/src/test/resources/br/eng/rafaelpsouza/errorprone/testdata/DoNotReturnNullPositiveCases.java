package br.eng.rafaelpsouza.errorprone.testdata;

/**
 * Created by Rafael Souza on 06/02/18.
 */
public class DoNotReturnNullPositiveCases {

    // BUG: Diagnostic contains: Do not return null.
    private Integer myMethod(){
        return null;
    }



}
