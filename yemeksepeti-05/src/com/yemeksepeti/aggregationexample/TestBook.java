package com.yemeksepeti.aggregationexample;

public class TestBook {
    public static void main(String[] args) {

        Author author1 = new Author("İlber Ortaylı", "i@o.com", 'm');
        Author author2 = new Author("Celal Şengör", "i@o.com", 'm');
        Author[] authors = new Author[2];
        authors[0] = author1;
        authors[1] = author2;

        Book book = new Book("Hayat Nasıl Yaşanır?", authors, 100.5);
        System.out.println(book);

    }
}
