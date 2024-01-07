import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StudentReportGUI extends JFrame implements ActionListener {
    private JTextField nameField, rollNumberField, marksField;
    private JButton displayButton;
    private JLabel nameLabel, rollNumberLabel, marksLabel, resultLabel;
    public StudentReportGUI() {
        setTitle("Student Report");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        nameLabel = new JLabel("Enter Student Name:");
        nameField = new JTextField(20);
        rollNumberLabel = new JLabel("Enter Roll Number:");
        rollNumberField = new JTextField(10);
        marksLabel = new JLabel("Enter Marks:");
        marksField = new JTextField(5);
        displayButton = new JButton("Display Report");
        resultLabel = new JLabel("");
        displayButton.addActionListener(this);
        setLayout(new FlowLayout());
        add(nameLabel);
        add(nameField);
        add(rollNumberLabel);
        add(rollNumberField);
        add(marksLabel);
        add(marksField);
        add(displayButton);
        add(resultLabel);
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == displayButton) {
            String name = nameField.getText();
            String rollNumber = rollNumberField.getText();
            int marks;
            try {
                marks = Integer.parseInt(marksField.getText());
            } catch (NumberFormatException ex) {
                marks = 0;
            }
            String grade = calculateGrade(marks);
            resultLabel.setText("Student Report:\nName: " + name + "\nRoll Number: " + rollNumber +
                    "\nMarks: " + marks + "\nGrade: " + grade);
        }
    }
    private String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StudentReportGUI().setVisible(true);
            }
        });
    }
}
