import p01_class.Animal;

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal();
    animal.legs = 4;
    Animal animal2 = new Animal();
    animal2.legs = 2;
    System.out.println(animal.legs);
    System.out.println(animal2.legs);
    animal.run();
    animal2.run();
  }
}


