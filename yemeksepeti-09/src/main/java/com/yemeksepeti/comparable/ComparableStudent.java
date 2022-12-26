package com.yemeksepeti.comparable;

public class ComparableStudent implements Comparable<ComparableStudent> {
    private String name;
    private long id = 0;
    private double gpa = 0.0;

    public ComparableStudent(String name, long id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "ComparableStudent{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(ComparableStudent that) {
        if (this.gpa != that.gpa) {
            return (this.gpa > that.gpa ? -1 : 1);
        }

        return 0;
    }

    //  @Override
  //  public int compareTo(ComparableStudent o) {
  //      int result = o.name.compareTo(this.name);
  //      if (result > 0) {
  //          return 1;
  //      } else if (result < 0) {
  //          return -1;
  //      } else {
  //          return 0;
  //      }
  //  }


}
