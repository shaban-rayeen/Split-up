import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;

public class Application {
    JFrame frame;
    JTextField  textfield;
    JComboBox<Integer> comboBox;
    JButton button;
    JLabel result;
    private final int frameX = 800;
    private final int frameY = 500;

    public Application(){
        JLabel price = new JLabel();
        price.setBounds(50,100,100,50);
        price.setText("Price");
        price.setBackground(Color.white);
        price.setForeground(Color.white);
        price.setFont(new Font("Comic sans",Font.PLAIN,15));
        price.setLayout(null);

        result = new JLabel();
        result.setBounds(100,250,600,300);
        result.setLayout(null);
        result.setForeground(Color.white);

        

        textfield= new JTextField();
        textfield.setText("$");
        textfield.setBounds(50,100,300,50);
        textfield.setFont(new Font("Aerial",Font.PLAIN, 17));
        textfield.setLayout(null);

        comboBox = new JComboBox<Integer>();
        comboBox.setBounds(500,100,100,40);
        for(int i=1;i<10;i++){
            comboBox.addItem(i);
        }
        comboBox.setLayout(null);

        button = new JButton("Split");
        button.setBounds(630,100,100,50);
        button.setBorder(BorderFactory.createMatteBorder(0,0,1,1,Color.white));
        button.setBackground(new Color(30,30,30,30));
        button.setContentAreaFilled(false);
        button.setOpaque(true);
        button.setFocusable(false);
        button.setLayout(null);
        button.setForeground(Color.white);
        button.addActionListener(e->{
            String p = textfield.getText();
            int q = comboBox.getItemAt(comboBox.getSelectedIndex()).intValue();
            result.setText("Result :$" + new splitUp().split(Double.parseDouble(p.substring(1)),q));
            
        });


        frame = new JFrame();
        frame.setSize(frameX,frameY);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.add(new Navbar());
        frame.add(textfield);
        frame.add(comboBox);
        frame.add(button);
        frame.add(result);
        frame.getContentPane().setBackground(new Color(30,30,30));
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Application();
    }
    
}