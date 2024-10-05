package ComboBox;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exercise extends JFrame implements ActionListener {
    private JComboBox<String> gener;
    private JTextArea txtArea;

    public Exercise() {
        setTitle("Movie Genre Selector");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(new JLabel("Welcome", JLabel.CENTER), BorderLayout.NORTH);

        JPanel mainContainer = new JPanel(new GridLayout(2, 1));

        JPanel container1 = new JPanel(new FlowLayout(FlowLayout.CENTER, 30, 10));
        container1.add(new JLabel("Genre:"));
        gener = new JComboBox<>(new String[]{"Drama", "Action", "Horror", "Tech"});
        container1.add(gener);
        gener.addActionListener(this);
        mainContainer.add(container1);

        JPanel container2 = new JPanel();
        container2.add(new JLabel("Movies: "));
        txtArea = new JTextArea(5, 15); 
        txtArea.setEditable(false);
        container2.add(txtArea);
        mainContainer.add(container2);

        add(mainContainer, BorderLayout.CENTER);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String selectedGenre = (String) gener.getSelectedItem();
        switch (selectedGenre) {
            case "Drama":
                txtArea.setText("1. the Fellow traveller\n2. Heart Stopper\n3. My policeman");
                break;
            case "Action":
                txtArea.setText("1. Mad Max: Fury Road\n2. John Wick\n3. Die Hard");
                break;
            case "Horror":
                txtArea.setText("1. The Shining\n2. Get Out\n3. A Nightmare on Elm Street");
                break;
            case "Tech":
                txtArea.setText("1. The Imitation Game\n2. Ex Machina\n3. The Matrix");
                break;
        }
    }

    public static void main(String[] args) {
        new Exercise();
    }
}
