package br.eng.rafaelpsouza.errorprone.testdata;

import javax.annotation.Nullable;

/**
 * Created by Rafael Souza on 06/02/18.
 */
public class DoNotReturnNullNegativeCases {

  public String getMyName() {
    return "Rafael";
  }

  @Nullable
  public Integer avg(int total) {
    return null;
  }

}
