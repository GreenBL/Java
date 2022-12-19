// code created by openAI's chatGPT

package bin.util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonWindow {
  public static void main(String[] args) {
    // create the main window
    JFrame frame = new JFrame("Window");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // create the button
    JButton button = new JButton("Button");
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // display the error prompt when the button is pressed
        JOptionPane.showMessageDialog(frame, "Error!", "ERROR", JOptionPane.ERROR_MESSAGE);
      }
    });

    // add the button to the main window
    frame.add(button, BorderLayout.CENTER);

    // display the main window
    frame.setSize(300, 300);
    frame.setVisible(true);
  }
}