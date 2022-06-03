import javax.swing.*;
import java.awt.*;

public class Lesson7 {
    public static void main(String[] args){

        MyFrame window = new MyFrame();
    }

}

class MyFrame extends JFrame{
    public MyFrame(){
        MyPanel panel = new MyPanel();
        Container container = getContentPane();
        container.add(panel);
        setBounds(10,10,800,600);
        setVisible(true);

    }
}

class MyPanel extends JPanel {
    public void paintComponent(Graphics gr){
        gr.setColor(Color.CYAN);
        for (int i = 1; i < 25; i++){
        gr.fillArc(29*i,40*i,50+i,49*i,409-2*i,39+8*i);}
        gr.drawRect(8,8,289,400);
        gr.setColor(Color.MAGENTA);
        gr.drawLine(29,70,409,390);
        gr.setColor(Color.GREEN);
        gr.fillRect(506,6,250,350);
    }


}

