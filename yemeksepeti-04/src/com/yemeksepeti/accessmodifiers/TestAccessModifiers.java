package com.yemeksepeti.accessmodifiers;

public class TestAccessModifiers {
    public static void main(String[] args) {
        AccessModifierExample accessModifier = new AccessModifierExample();
        System.out.println(accessModifier.protectedStr);
        System.out.println(accessModifier.publicStr);
        System.out.println(accessModifier.defaultStr);

    }
}
