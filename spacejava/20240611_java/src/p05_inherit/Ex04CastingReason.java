package p05_inherit;

import java.util.Scanner;

public class Ex04CastingReason {
  public static void main(String[] args) {
    Buyer b = new Buyer();
    Television t = new Television();
    Audio a = new Audio();
    Laptop l = new Laptop();

    b.buy(t);
    b.buy(a);
    b.buy(l);
    System.out.println(b.money);
  }
}

class Buyer {
  int money = 1000;

  void buy(Product product) {
    money -= product.price;
  }
}

abstract class Product {
  int price;
  public Product(int price) {
    this.price = price;
  }
}

class Laptop extends Product {
  public Laptop() {
    super(40);
  }
}

class Television extends Product {
  public Television() {
    super(50);
  }
}

class Audio extends Product {
  public Audio() {
    super(30);
  }
}

