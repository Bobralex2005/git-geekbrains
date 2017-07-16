import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alexander Bugaev on 15.07.2017.
 * Создать окно для клиентской части чата: большое текстовое поле для отображения переписки в центре окна. Однострочное
 * текстовое поле для ввода сообщений и кнопка для отсылки сообщений на нижней панели. Сообщение должно отсылаться либо
 * по нажатию кнопки на форме, либо по нажатию кнопки Enter. При «отсылке» сообщение перекидывается из нижнего поля в
 * центральное
 */
public class Window extends JFrame {

    public Window() {
        super("JustAChat");
        setSize(500, 700);
        //set window on the centre of the screen
        setLocationRelativeTo(null);
        //resize of window locked
        setResizable(false);
        //exit on close
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel jpNorth = new JPanel();
        JPanel jpSouth = new JPanel();
        JPanel jpCenter = new JPanel();

        //create menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menuMain = new JMenu("Menu");
        JMenuItem about = new JMenuItem("About");

        setJMenuBar(menuBar);
        menuBar.add(menuMain);
        menuMain.add(about);

        //adding the label
        JLabel lblInst = new JLabel("<html>Instruction:<br> 1. Input a message<br>2. Press an \"SEND\" button");


        jpCenter.setBackground(Color.lightGray);
//        jpSouth.setPreferredSize(new Dimension(1, 40));
//        jpNorth.setPreferredSize(new Dimension(1, 40));

        add(jpNorth, BorderLayout.NORTH);
        add(jpCenter, BorderLayout.CENTER);
        add(jpSouth, BorderLayout.SOUTH);

        jpCenter.setLayout(new BorderLayout());
        jpSouth.setLayout(new FlowLayout());
        jpNorth.setLayout(new BorderLayout());

        JButton mainButton = new JButton("SEND");
        JTextField inputArea = new JTextField(37);
        JTextArea showArea = new JTextArea();
        showArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(showArea);
        showArea.setLineWrap(true);
        showArea.setWrapStyleWord(true);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        jpCenter.add(scrollPane);
        jpSouth.add(inputArea);
        jpSouth.add(mainButton);
        jpNorth.add(lblInst, BorderLayout.WEST);

        about.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "I was forced to write this code", "About", JOptionPane.PLAIN_MESSAGE);
            }
        });

        mainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showArea.append(inputArea.getText() + "\n");
                inputArea.setText("");
                inputArea.grabFocus();
            }
        });

        inputArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showArea.append(inputArea.getText() + "\n");
                inputArea.setText("");
                inputArea.grabFocus();
            }
        });

        setVisible(true);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Window();
            }
        });
    }
}
