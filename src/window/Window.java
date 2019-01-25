package window;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Window extends  JFrame{

    public static JLabel textPosRightTopLabel = new JLabel("Значения");
    public static JTextField textField = new JTextField(20);
    public static JButton button = new JButton("Test button");

    public static Container container;


    public Window(){
            super("My First window.Window"); //Заголовок окна
            setBounds(100, 100, 200, 200); //Если не выставить
            //размер и положение
            //то окно будет мелкое и незаметное




            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //это нужно для того чтобы при
            //закрытии окна закрывалась и программа,
            //иначе она останется висеть в процессах

             container =this.getContentPane();

            container.setLayout(new FlowLayout());

            container.add(textPosRightTopLabel);
            container.add(textField);
            container.add(button);



            ActionListener actionListener = new MyActionListener();

            button.addActionListener(actionListener);


        }

        public static void main(String[] args) { //эта функция может быть и в другом классе
            Window app = new Window(); //Создаем экземпляр нашего приложения
            app.setVisible(true); //С этого момента приложение запущено!
        }

}
