package br.eng.rafaelpsouza.errorprone;

import com.google.auto.service.AutoService;
import com.google.errorprone.BugPattern;
import com.google.errorprone.VisitorState;
import com.google.errorprone.bugpatterns.BugChecker;
import com.google.errorprone.matchers.Description;
import com.google.errorprone.matchers.Matcher;
import com.sun.source.tree.MethodTree;
import com.sun.source.tree.ReturnTree;
import com.sun.source.tree.Tree;

import javax.annotation.Nullable;

import static com.google.errorprone.BugPattern.Category.JDK;
import static com.google.errorprone.BugPattern.SeverityLevel.SUGGESTION;
import static com.google.errorprone.matchers.Matchers.contains;
import static com.google.errorprone.matchers.Matchers.hasAnnotation;
import static com.google.errorprone.matchers.Matchers.methodReturnsNonNull;

/**
 * Created by Rafael Souza on 06/02/18.
 */
@AutoService(BugChecker.class)
@BugPattern(
        name = "DoNotReturnNull",
        summary = "Do not return null.",
        category = JDK,
        severity = SUGGESTION)
public class DoNotReturnNull extends BugChecker implements BugChecker.MethodTreeMatcher {

    private static final Matcher<Tree> HAS_NULLABLE_ANNOTATION = hasAnnotation(Nullable.class.getCanonicalName());
    private static final Matcher<Tree> CONTAINS_RETURN_NULL = contains(new ReturnNullMatcher());

    @Override
    public Description matchMethod(MethodTree tree, VisitorState state) {
        if(!HAS_NULLABLE_ANNOTATION.matches(tree, state) && CONTAINS_RETURN_NULL.matches(tree, state)){
            return describeMatch(tree);
        }

        return Description.NO_MATCH;
    }

    private static class ReturnNullMatcher implements Matcher<Tree> {
        @Override
        public boolean matches(Tree tree, VisitorState state) {
            if(tree instanceof ReturnTree){
                return tree.getKind().equals(Tree.Kind.NULL_LITERAL);
            }
            return false;

        }
    }
}


