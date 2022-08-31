package codechallenges.linkedlist;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnimalShelterTests {

  @Test
  void putInShelter(){
    Dog fido = new Dog();
    Cat tabby = new Cat();
    AnimalShelter<Animal> shelter = new AnimalShelter<>();

    shelter.enqueue(fido);
    shelter.enqueue(tabby);

    assertEquals(tabby,shelter.shelter.peek());
    

  }

}
