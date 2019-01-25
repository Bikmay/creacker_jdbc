package data;

import window.MyActionListener;

import javax.swing.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.*;
import java.util.ArrayList;



public class Database {

    public static Employee getQuery(String tableName,int n) throws IOException, SQLException {

        connect();

        Connection connection = connect();
        Statement statement = connection.createStatement();

        System.out.println("qw");

PreparedStatement st = connection.prepareStatement("SELECT * FROM worker WHERE ID=?");
        System.out.println("sd");

st.setInt(1, n);

        System.out.println("2");

        ResultSet resultSet = st.executeQuery();

        System.out.println("1");
        if(resultSet==null)
            System.out.println("result null");
        Employee employee=new Employee();

            employee.id =resultSet.getInt(1);
            employee.name=resultSet.getString(2);
            employee.job=resultSet.getString(3);
            employee.company=resultSet.getString(4);
            employee.location=resultSet.getString(5);
            employee.range=resultSet.getInt(6);







        resultSet.close();
        statement.close();
        connection.close();
        return employee;



    }


    private static  Connection connect() throws IOException, SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{

            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:/home/artyom/IdeaProjects/creacker_jdbc/src/data/workers.sqlite");

            return connection;



        }catch (Exception e){
            System.out.println("fail");
            e.printStackTrace();

            MyActionListener.messege();
        }
        finally {

        }


        return null;

    }




}
