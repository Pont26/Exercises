package GUIProject;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;

public class TableButtonExample {

    public static void main(String[] args) {
        // Sample data for the JTable
        String[] columnNames = {"Item", "Action"};
        Object[][] data = {
            {"Item 1", "Delete"},
            {"Item 2", "Delete"},
            {"Item 3", "Delete"},
          
        };

        // Create the table model and JTable
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        JTable table = new JTable(model);

        // Add a button to the "Action" column
        table.getColumn("Action").setCellRenderer(new ButtonRenderer());
        table.getColumn("Action").setCellEditor(new ButtonEditor(new JCheckBox(), model));

        // Set up the JFrame
        JFrame frame = new JFrame("JTable Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JScrollPane(table));
        frame.pack();
        frame.setVisible(true);
    }
}

// Renderer for the button
class ButtonRenderer extends JButton implements TableCellRenderer {
    public ButtonRenderer() {
        setOpaque(true);
    }

    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus, int row, int column) {
        setText((value == null) ? "" : value.toString());
        return this;
    }
}

// Editor for the button (handling the action)
class ButtonEditor extends DefaultCellEditor {
    protected JButton button;
    private String label;
    private boolean clicked;
    private JTable table;
    private DefaultTableModel model;
    private int row;

    public ButtonEditor(JCheckBox checkBox, DefaultTableModel model) {
        super(checkBox);
        this.model = model;
        button = new JButton("Delete");
        button.setOpaque(true);

        // Action listener for the button click
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                fireEditingStopped();
            }
        });
    }

    public Component getTableCellEditorComponent(JTable table, Object value,
                                                 boolean isSelected, int row, int column) {
        label = (value == null) ? "" : value.toString();
        button.setText(label);
        clicked = true;
        this.table = table;
        this.row = row;  // Store the row index
        return button;
    }

    public Object getCellEditorValue() {
        if (clicked) {
            // Delete the row from the table model
            model.removeRow(row);
        }
        clicked = false;
        return label;
    }

    public boolean stopCellEditing() {
        clicked = false;
        return super.stopCellEditing();
    }

    protected void fireEditingStopped() {
        super.fireEditingStopped();
    }
}
