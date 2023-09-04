import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class GUI17 extends JFrame {
    static String answer="Зима";
    public static void main(String[] args) {
        JFrame jFrame=getFrame();
        JPanel jPanel= new JPanel();
        jFrame.add(jPanel);

        ButtonGroup group = new ButtonGroup();
        JRadioButton button1 = new JRadioButton("Зима",true);
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button1.setMaximumSize(new Dimension(100,30));
        group.add(button1);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer="Зима";
            }
        });
        JRadioButton button2 = new JRadioButton("Весна",false);
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.setMaximumSize(new Dimension(100,30));
        group.add(button2);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer="Весна";
            }
        });
        JRadioButton button3 = new JRadioButton("Лето",false);
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);
        button3.setMaximumSize(new Dimension(100,30));
        group.add(button3);
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer="Лето";
            }
        });
        JRadioButton button4 = new JRadioButton("Осень",false);
        button4.setAlignmentX(Component.CENTER_ALIGNMENT);
        button4.setMaximumSize(new Dimension(100,30));
        group.add(button4);
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer="Осень";
            }
        });


        JButton jButton = new JButton("Ответить");
        jButton.setBounds(150,40,100,50);
        jButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel jLabel = new JLabel("Ответ: ");
        jLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("Ответ: "+answer);
            }
        });


        jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
        jPanel.add(Box.createVerticalStrut(10));
        jPanel.add(button1);

        jPanel.add(button2);

        jPanel.add(button3);

        jPanel.add(button4);

        jPanel.add(jButton);
        jPanel.add(Box.createVerticalStrut(10));
        jPanel.add(jLabel);


        jFrame.setLayout(null);
        jFrame.setVisible(true);
    }

    static JFrame getFrame(){
        JFrame jFrame= new JFrame(){};
        jFrame.setTitle("GUI14");
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        jFrame.setBounds(dim.width / 2 - 200 / 2, dim.height / 2 - 200 / 2, 200, 250);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        return jFrame;
    }
}
