package br.eng.rafaelpsouza.errorprone;

import com.google.errorprone.CompilationTestHelper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by Rafael Souza on 06/02/18.
 */
@RunWith(JUnit4.class)
public class DoNotReturnNullTest {

    private CompilationTestHelper compilationHelper;

    @Before
    public void setup() {
        compilationHelper = CompilationTestHelper.newInstance(DoNotReturnNull.class, getClass()).ignoreJavacErrors();
    }

    @Test
    public void doNotReturnNullPositiveCases() {
        compilationHelper.addSourceFile("DoNotReturnNullPositiveCases.java").doTest();
    }

}