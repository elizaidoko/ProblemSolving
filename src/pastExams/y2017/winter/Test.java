package pastExams.y2017.winter;

import javax.swing.*;

public class Test {
    public static void main(String[] args){
        Person t = new Person("Eliza", "TTca");
        SavingsAccount p = new SavingsAccount(t,76543,123456,36);

        JTextArea textArea = new JTextArea(10,30);
        textArea.setText(p.toString());
        JOptionPane.showMessageDialog(null,textArea,"peple",JOptionPane.INFORMATION_MESSAGE);
    }
}
