package com.yemeksepeti.accessmodifiers2;

import com.yemeksepeti.accessmodifiers.AccessModifierExample;

public class TestAccessModifiers extends AccessModifierExample {
    public static void main(String[] args) {
        new TestAccessModifiers().foo();
    }

    private void foo() {
        AccessModifierExample accessModifier = new AccessModifierExample();
        System.out.println(this.protectedStr);
        System.out.println(accessModifier.publicStr);
        // System.out.println(accessModifier.defaultStr);
    }


}
