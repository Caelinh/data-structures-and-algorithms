package codechallenges;

import codechallenges.StacksAndQueues.StackChallenges;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BracketTest {
  String beFalse = "((hjklasjd)";
  String beTrue = "({[123hf]})";

  @Test
  public void testBrackets(){
//Testing with a true
   assertTrue(StackChallenges.validateBrackets(beTrue));
   //test expecting false
   assertFalse(StackChallenges.validateBrackets(beFalse));

  }

}
