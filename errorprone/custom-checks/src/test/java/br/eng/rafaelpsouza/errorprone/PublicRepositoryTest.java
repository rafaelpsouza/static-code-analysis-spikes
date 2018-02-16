package br.eng.rafaelpsouza.errorprone;

import com.google.errorprone.CompilationTestHelper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * Created by Rafael Souza on 15/02/18.
 */
@RunWith(JUnit4.class)
public class PublicRepositoryTest {

  private CompilationTestHelper compilationHelper;

  @Before
  public void setup() {
    compilationHelper = CompilationTestHelper.newInstance(PublicRepository.class, getClass());
  }

  @Test
  public void defaultInterfaceRepository() {
    compilationHelper.addSourceFile("MyDefaultInterfaceRepository.java").doTest();
  }

  @Test
  public void publicClassRepository() {
    compilationHelper.addSourceFile("MyPublicClassRepository.java").doTest();
  }

  @Test
  public void publicInterfaceRepository() {
    compilationHelper.addSourceFile("MyPublicInterfaceRepository.java").doTest();
  }

  @Test
  public void publicInterfaceService() {
    compilationHelper.addSourceFile("MyPublicInterfaceService.java").doTest();
  }

  @Test
  public void publicService() {
    compilationHelper.addSourceFile("MyPublicService.java").doTest();
  }

}