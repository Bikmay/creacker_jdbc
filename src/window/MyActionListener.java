package window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;

import data.*;

import javax.swing.*;

public class MyActionListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        int id;
        System.out.println("enter");


        try {
            id=Integer.parseInt(Window.textField.getText());
            Employee employee=Database.getQuery("worker",id);
            System.out.println(employee.toString());
            Window.textPosRightTopLabel.setText(employee.toString());

        }
        catch (Exception e1){
            messege();
        }




    }
    public static void messege(){

        JOptionPane.showMessageDialog(Window.container,
    "Correction your request",
    "DB error",
    JOptionPane.ERROR_MESSAGE);
    }
}
