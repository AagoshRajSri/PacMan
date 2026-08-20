import javax.swing.JFrame; 
// javax.swing - package containing classes for building GUI
// JFrame represents the actual application window.

public class App {
    public static void main(String[] args) throws Exception {
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        JFrame frame = new JFrame("PacMan"); // name of window
        frame.setSize(boardWidth, boardHeight); // sets the size of the window
//      frame.setVisible(true); // makes the window visible
        frame.setLocationRelativeTo(null); // to center the window on the screen
        frame.setResizable(false); // to prevent resizing the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // to close the application when the window is closed

        PacMan pacman = new PacMan();
        frame.add(pacman); // adds the PacMan panel to the frame
        frame.pack();
        pacman.requestFocus();
        frame.setVisible(true); 
    }
}
