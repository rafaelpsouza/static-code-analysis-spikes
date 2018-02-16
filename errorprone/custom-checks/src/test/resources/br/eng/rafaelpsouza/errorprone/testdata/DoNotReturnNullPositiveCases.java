package br.eng.rafaelpsouza.errorprone.testdata;

import javax.annotation.Nullable;

/**
 * Created by Rafael Souza on 06/02/18.
 */
public class DoNotReturnNullPositiveCases {

  // BUG: Diagnostic contains: Do not return null.
  public Object myMethod() {
    return null;
  }

  // BUG: Diagnostic contains: Do not return null.
  public Integer math(int total){
    if(total == 1){
      return null;
    }

    return 0;
  }
}
