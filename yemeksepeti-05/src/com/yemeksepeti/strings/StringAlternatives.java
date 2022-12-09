package com.yemeksepeti.strings;

public class StringAlternatives {
    public static void main(String[] args) {

        // String immutable (değiştirilemez)
        String str = "Yemek";
        System.out.println("String memory ID : " + str.hashCode());
        str += "Sepeti";
        System.out.println("String memory ID : " + str.hashCode());
        System.out.println("String : " + str);

        // mutable (değiştirilebilir)
        // asyncronized (non thread-safe)
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Yemek");
        System.out.println("StringBuilder memory ID : " + stringBuilder.hashCode());
        stringBuilder.append("Sepeti");
        System.out.println("StringBuilder memory ID : " + stringBuilder.hashCode());
        System.out.println("StringBuilder : " + stringBuilder);

        // mutable (değiştirilebilir)
        // syncronized (thread-safe)
        // slower then StringBuilder
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Yemek");
        System.out.println("StringBuffer memory ID : " + stringBuffer.hashCode());
        stringBuffer.append("Sepeti");
        System.out.println("StringBuffer memory ID : " + stringBuffer.hashCode());
        System.out.println("StringBuffer : " + stringBuffer);


    }
}
