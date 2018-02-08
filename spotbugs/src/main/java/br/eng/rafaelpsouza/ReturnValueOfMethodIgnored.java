package br.eng.rafaelpsouza;

/**
 * Created by Rafael Souza on 07/02/18.
 */
public class ReturnValueOfMethodIgnored {

    public Boolean myMethod1(){
        String myString = "abc";
        myString.replace("a", "1");
        if(myString.equals("1bc")) return true;

        return false;
    }

}
