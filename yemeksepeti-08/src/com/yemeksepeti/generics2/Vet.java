package com.yemeksepeti.generics2;

public interface Vet<T extends Pet> {
    void operatePet(T pet);
    T adoptPet(String name, T pet);
}
