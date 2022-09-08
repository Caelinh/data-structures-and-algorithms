package codechallenges.StacksAndQueues;

public class AnimalShelter <T>{

  PseudoQueue<T> shelter = new PseudoQueue<>();

  public void enqueue(T animal) {
    shelter.enqueue(animal);
  }

  public T dequeue(T pref){
    return shelter.dequeue(pref);
  }
}
