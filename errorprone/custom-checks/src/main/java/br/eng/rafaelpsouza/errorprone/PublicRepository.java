package br.eng.rafaelpsouza.errorprone;

import com.google.auto.service.AutoService;
import com.google.errorprone.BugPattern;
import com.google.errorprone.VisitorState;
import com.google.errorprone.bugpatterns.BugChecker;
import com.google.errorprone.matchers.Description;
import com.sun.source.tree.ClassTree;

import javax.lang.model.element.Modifier;

import static com.google.errorprone.BugPattern.Category.JDK;
import static com.google.errorprone.BugPattern.SeverityLevel.SUGGESTION;
import static com.google.errorprone.BugPattern.SeverityLevel.WARNING;

/**
 * Created by Rafael Souza on 15/02/18.
 */
@AutoService(BugChecker.class)
@BugPattern(
        name = "PublicRepository",
        summary = "Stop making everything public.",
        linkType = BugPattern.LinkType.CUSTOM,
        link = "http://www.codingthearchitecture.com/2014/10/01/modularity_and_testability.html",
        category = JDK,
        severity = SUGGESTION)
public class PublicRepository extends BugChecker implements BugChecker.ClassTreeMatcher {

  @Override
  public Description matchClass(ClassTree tree, VisitorState state) {
    if(isRepository(tree) && isPublic(tree)){
      return describeMatch(tree);
    }

    return Description.NO_MATCH;
  }

  private boolean isRepository(ClassTree tree) {
    return tree.getSimpleName().toString().contains("Repository");
  }

  private boolean isPublic(ClassTree tree) {
    return tree.getModifiers().getFlags().contains(Modifier.PUBLIC);
  }
}
