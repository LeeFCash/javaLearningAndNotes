import javax.swing.*;
import java.awt.Color;
// Defines a class named MyWindow that extends JFrame. By extending JFrame, MyWindow inherits all the properties and methods of a JFrame, allowing it to act as a window.
public class MyWindow extends JFrame
{
 //down 1 (This is the constructor for the MyWindow class, executed when a new MyWindow object is created (e.g., new MyWindow()).)
 MyWindow(){
  //JFrame window = new JFrame();// makes window 
  this.setTitle("PC app also for learning"); // when using window manager this does not show or at least on hyprland 
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit=(close it), HIDE=(go to background), DO_NOTHING=(do nothing), DISPOSE_ON_CLOSE=(which disposes of the window (frees its resources) but may not terminate the application if other windows remain open.)
  this.setResizable(true);
  this.setSize(500,500);
  this.setVisible(true); // make window visible 
  //ImageIcon image = new ImageIcon("logo.png")// for icon change for window 
  //window.setIconImage(image.getImage()); // change icon 
  this.getContentPane().setBackground(new Color(0,0,0));// Color.BLACK
 }
}
