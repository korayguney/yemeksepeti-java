package com.yemeksepeti.bmi;

import javax.swing.*;

public class BmiCalculatorGUI {
    static Double weight;
    static Double height;
    static Double bmi;

    public static void main(String[] args) {
        getWeigh();
        getHeigh();
        calculateBmi();
        whatIsMyCondition();
        exit();
    }

    public static void whatIsMyCondition(){
        if(bmi < 18.5){
            JOptionPane.showMessageDialog(null, " You are underweight ");
        }else if(bmi > 18.5 && bmi<24.9){
            JOptionPane.showMessageDialog(null, " You are normal ");
        }else if(bmi > 25.0 && bmi<29.9){
            JOptionPane.showMessageDialog(null, " You are overweight ");
        }else if(bmi > 30.0 ){
            JOptionPane.showMessageDialog(null, " You are very overweight ");
        }else{
            JOptionPane.showMessageDialog(null, " You entered incorrect values ");
        }
    }

    public static void calculateBmi (){
        bmi = weight/(height*height);
        JOptionPane.showMessageDialog(null, "Your bmi is : " + bmi);
    }

    public static void getWeigh(){
        weight=  Double.valueOf(JOptionPane.showInputDialog("Please enter the weight : "));
    }

    public static void getHeigh(){
        height =Double.valueOf(JOptionPane.showInputDialog("Please enter the height : "));
    }

    private static void exit() {
        JOptionPane.showMessageDialog(null, "Bye bye");
        System.exit(0);
    }
}

