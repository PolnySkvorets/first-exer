package first_exer;

import javax.swing.*;


public class FirstExer extends JFrame {// наследуем от класса jFrame , то есть создаем рамку

    public  FirstExer () { /** конструктор окна */

    initUI();

    }

    private void initUI() {

        setTitle("First Exercise");  // параметры окна - подпись, размеры, привязка, выход по зпкрытию
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
	    FirstExer ex = new FirstExer();
	    ex.setVisible(true);// вывод окна
    }
}
