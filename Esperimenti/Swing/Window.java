import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Container;
import java.awt.BorderLayout;

public class Window extends JFrame{
    final int WIDTH = 400;
    final int HEIGTH = 800;
    public Window(String title){
        super(title);
        init(WIDTH, HEIGTH);
    }
    public Window(String title, int w, int h){
        super(title);
        init(w, h);
    }
    private void init(int width, int heigth){
        this.setSize(width, heigth);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lblNorth = new JLabel("North");
        lblNorth.setBackground(Color.ORANGE);
        lblNorth.setOpaque(true);
        //lblNorth.setPreferredSize(new Dimension(150, 150));

        JLabel lblCenter = new JLabel("Center", JLabel.CENTER);
        lblCenter.setBackground(Color.GREEN);
        lblCenter.setOpaque(true);
        //lblCenter.setPreferredSize(new Dimension(150, 150));

        JLabel lblWest = new JLabel("West");
        lblWest.setBackground(Color.RED);
        lblWest.setOpaque(true);
        //lblWest.setPreferredSize(new Dimension(150, 150));

        JButton btnEast = new JButton("Clickable Element EAST");
        //btnEast.setPreferredSize(new Dimension(150, 150));

        JButton btnSouth = new JButton("Clickable Element SOUTH");
        //btnSouth.setPreferredSize(new Dimension(150, 150));
        /*
        Container topContainer = this.getContentPane();
        topContainer.add(lblNorth, BorderLayout.NORTH);
        topContainer.add(lblCenter, BorderLayout.CENTER);
        topContainer.add(btnEast, BorderLayout.EAST);
        topContainer.add(lblWest, BorderLayout.WEST);
        topContainer.add(btnSouth, BorderLayout.SOUTH);
        */

        JPanel pnlNorth = new JPanel();
        JPanel pnlSouth = new JPanel();
        JPanel pnlWest = new JPanel();
        JPanel pnlEast = new JPanel();
        JPanel pnlCenter = new JPanel();

        pnlNorth.add(lblNorth);
        pnlSouth.add(btnSouth);
        pnlWest.add(lblWest);
        pnlEast.add(btnEast);
        pnlCenter.add(lblCenter);

        Container topContainer = this.getContentPane();
        topContainer.add(pnlNorth, BorderLayout.NORTH);
        topContainer.add(pnlCenter, BorderLayout.CENTER);
        topContainer.add(pnlEast, BorderLayout.EAST);
        topContainer.add(pnlWest, BorderLayout.WEST);
        topContainer.add(pnlSouth, BorderLayout.SOUTH);
    }

}