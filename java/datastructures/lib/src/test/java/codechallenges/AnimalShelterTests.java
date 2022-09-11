package codechallenges;


import codechallenges.StacksAndQueues.Animal;
import codechallenges.StacksAndQueues.AnimalShelter;
import codechallenges.StacksAndQueues.Cat;
import codechallenges.StacksAndQueues.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalShelterTests {

  @Test
  void putInShelter(){
    Dog fido = new Dog();
    Cat tabby = new Cat();
    AnimalShelter<Animal> shelter = new AnimalShelter<>();

    shelter.enqueue(fido);
    shelter.enqueue(tabby);




  }

}
