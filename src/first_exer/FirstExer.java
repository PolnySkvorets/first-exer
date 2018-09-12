package first_exer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class FirstExer extends JFrame {// наследуем от класса jFrame (контейнер верхнего уровня) , то есть создаем рамку

    public  FirstExer () { /** конструктор окна  */

    initUI();

    }

    private void initUI() {

        JButton quitButton = new JButton("Quit"); // создание объекты кнопки выхода

        quitButton.addActionListener((ActionEvent event) -> { // задание дейстаия при нажатии на кнопку
            System.exit(0);
        });
            createLayout(quitButton);


        setTitle("First Exercise with quit button");  // параметры окна - подпись, размеры, привязка, выход по зпкрытию
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg) {

      Container pane = getContentPane();
      GroupLayout gl = new GroupLayout(pane);
      pane.setLayout(gl);

      gl.setAutoCreateContainerGaps(true);

      gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));

      gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]));


    }


    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            FirstExer ex = new FirstExer();
            ex.setVisible(true);// вывод окна
        });
    }
}
