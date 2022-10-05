package LabSheet7.Exercise1;

import javax.swing.*;

public class TestLineItem {
    public static void main(String[] args) {
        String output = "", output2 = "", output3 = "";
        LineItem L1 = new LineItem();
        Product P1 = new Product();

        output += "Calling the no-argument Computer constructor. " + "The first Computer object details are: \n\n" + L1.toString() + P1.toString();
        LineItem L2 = new LineItem(15);
        Product P2 = new Product("Pen", "A new balllpoint pen");
        output2 += "\n\nCalling the multi argument constructor. " + "The first Line Items details are: \n\n" + L2.toString() + P2.toString();
        LineItem L3 = new LineItem(35);
        Product P3 = new Product("Pencil", "A new pencil");
        output3 += "\n\nCalling the multi argument constructor. " + "The first Line Items details are: \n\n" + L3.toString() + P3.toString();
        JOptionPane.showMessageDialog(null,output+output2+output3, "Computer Object Data", JOptionPane.INFORMATION_MESSAGE);
    }
}
