package br.eng.rafaelpsouza.errorprone.testdata;

import javax.annotation.Nullable;

/**
 * Created by Rafael Souza on 06/02/18.
 */
// BUG: Diagnostic contains: Stop making everything public.
public class MyPublicClassRepository {

  public void save(String name){

  }

  public String loadById(int id){
    return "Me";
  }

}
