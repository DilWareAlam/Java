import javax.swing.*;

public class GradeBook {    
    public static void main( String[] args )
    {
        JFrame frame = new JFrame();
        JButton button = new JButton("Click me");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentpane().add(button);
        
        frame.setSize(300, 300);
        
        frame.setVisible(true);
    }
    
}