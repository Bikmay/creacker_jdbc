import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Window extends  JFrame{



        public Window(){
            super("My First Window"); //Заголовок окна
            setBounds(100, 100, 200, 200); //Если не выставить
            //размер и положение
            //то окно будет мелкое и незаметное




            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //это нужно для того чтобы при
            //закрытии окна закрывалась и программа,
            //иначе она останется висеть в процессах

            JTextField textField = new JTextField(20);
            getContentPane().add(textField, BorderLayout.NORTH);
            JLabel textPosRightTopLabel = new JLabel("Значения");
            getContentPane().add(textPosRightTopLabel);


            JButton button = new JButton("Test button");
            ActionListener actionListener = new MyActionListener();

            button.addActionListener(actionListener);
            getContentPane().add(button);


        }

        public static void main(String[] args) { //эта функция может быть и в другом классе
            Window app = new Window(); //Создаем экземпляр нашего приложения
            app.setVisible(true); //С этого момента приложение запущено!
        }

}
