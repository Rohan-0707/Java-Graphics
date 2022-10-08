//  This code is designed by Mr. Rohan Kumar Bhoi  
//  GitHub : github.com/rohan-0707  
//  Instagram : i_am_the_rohan_  
//  Facebook : facebook.com/rohan.bhoi.07  
//  Mail ID : rohanbhoi1546@gmail.com  
// Linkdin : rohan-kumar-bhoi  
// Twitter : @rohanbhoi07 


import java.awt.*;
//import java.applet.*;
//import java.lang.*;
//import java.io.*;
//import java.util.*;

class Practicle1 extends Frame
{
    Dropdown()
    {
        Frame f = new Frame();
        /*Label l = new Label("Student name : ");
        TextField t = new TextField("Enter Name : ");
        //Button b1 = new Button("Submit");
        //Button b2 = new Button("Cancle");
        f.setSize(500,500);
        f.add(l);
        f.setVisible(true);
        l.setBounds(10,100,100,30);
        t.setBounds(50,120,100,30);
        f.add(t); */

        Choice c = new Choice();
        c.add("AJP");
        c.add("EST");
        c.add("CSS");
        c.add("OSY");
        c.add("STE");

        Label l = new Label("Select a Subject ");

        f.setSize(500,500);
        f.add(c);
        f.add(l);
        f.setVisible(true);
        f.setLayout(null);
        l.setBounds(100,100,300,50);
        c.setBounds(120,150,100,100);

    }

    public static void main(String args[])
    {
        new Dropdown();
    }
}


// ____________________________________________________________________________________________________________________________________________________
//                                                                          Thank You !
// ____________________________________________________________________________________________________________________________________________________
