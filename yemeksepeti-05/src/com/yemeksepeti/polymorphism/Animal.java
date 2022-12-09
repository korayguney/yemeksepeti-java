package com.yemeksepeti.polymorphism;

class Animal {
    public void makeSound() {
        System.out.println("No Sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat sound");
    }
}

class TestClass {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        if(myDog instanceof Cat) {
            Cat myCat = (Cat) myDog;
        } else {
            System.out.println("myDog is not an object of Cat");
        }
        myDog.makeSound();
    }
}
