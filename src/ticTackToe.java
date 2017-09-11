import java.awt.Graphics;
import javax.swing.JApplet;

public class ticTackToe extends JApplet {
    public void paint(Graphics canvas) {

        canvas.drawLine(100,50,100,200);
        canvas.drawLine(150,50,150,200);
        canvas.drawLine(50,100,200,100);
        canvas.drawLine(50,150,200,150);

        canvas.drawOval(100,100,50,50);
        canvas.drawOval(150,150,50,50);

        canvas.drawLine(50,100,100,150);
        canvas.drawLine(50,150,100,100);

        canvas.drawLine(50,150,100,200);
        canvas.drawLine(50,200,100,150);

        canvas.drawLine(50,50,100,100);
        canvas.drawLine(50,100,100,50);

        canvas.drawLine(75,50,75,200);
    }


}
