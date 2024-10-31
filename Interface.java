import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.*; //importanto classes do pacote swing, que e usado para criar interfaces graficas em java 

public class Interface {
    public static void main(String[] args) {  //metodo main executa a criacao da interface 

        JFrame frame = new JFrame("AWT Test");   // objeto Jframe criado, representa a janela principal da aplicacao (titulo de AWT test)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // faz com que o programa seja encerrado quando a janela é fechada.
        frame.setSize(400, 200);
        frame.setLayout(new BorderLayout());

        JLabel label1 = new JLabel("label1");    //Um JPanel é criado. Um JPanel é um contêiner que pode armazenar outros componentes (como botões e campos de texto).
        JTextField textField = new JTextField(15);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        topPanel.add(label1);
        topPanel.add(textField);


        JButton button1 = new JButton("Button 1");   //Aqui, são criados três botões (JButton) com os rótulos "Button 1", "Button 2" e "Button 3".
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        JPanel buttonPanel = new JPanel(); //Um outro painel é criado, desta vez para os botões.
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);


        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);  //tornar frame invisivel

    }

    }
