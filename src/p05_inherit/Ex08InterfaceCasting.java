package p05_inherit;

import common.Utils;

public class Ex08InterfaceCasting {
  public static void main(String[] args) {
    Mammals[] mammals = {new Dog(), new Cat(), new Bat()};
    Birds[] birds = {new Parrot(), new Eagle(), new Chicken()};

    Flyable[] flyables = {new Bat(), new Eagle(), new Parrot()};
    IGround[] iGrounds = {new Cat(), new Dog(), new Chicken()};
    Object obj = 10;
    Utils.typeOf(obj);
  }
}

interface Flyable { }
interface IGround { }

class Birds { }

class Parrot extends Birds implements Flyable { }

class Eagle extends Birds implements Flyable {
}

class Chicken extends Birds implements IGround {
}

class Mammals {
}

class Dog extends Mammals implements IGround {
}

class Cat extends Mammals implements IGround {
}

class Bat extends Mammals implements Flyable {
}
