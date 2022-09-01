package codechallenges.linkedlist;
import codechallenges.linkedlist.StackChallenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BracketTest {
  String beFalse = "((hjklasjd)";
  String beTrue = "({[123hf]})";

  @Test
  public void testBrackets(){

    assertTrue(StackChallenges.validateBrackets(beTrue));
    assertFalse(StackChallenges.validateBrackets(beFalse));
  }

}
