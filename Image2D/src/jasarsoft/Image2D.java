
package jasarsoft;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image2D {

    public static void main(String[] args) {
        
        BufferedImage image = new BufferedImage(300, 300, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = (Graphics2D)image.getGraphics();
        
        graphics.setPaint(Color.GRAY);
        graphics.fillRect(10, 10, 280, 280);
        
        graphics.setPaint(Color.BLUE);
        graphics.fillRect(20, 20, 50, 50);
        
        graphics.setPaint(Color.RED);
        graphics.setStroke(new BasicStroke(5.0f));
        graphics.drawArc(50, 50, 100, 100, 90, 180);
        
        graphics.setFont(new Font("Calibri", Font.BOLD, 32));
        graphics.setPaint(Color.WHITE);
        graphics.drawString("Slika", 200, 200);
        
//        image.setRGB(10, 10, 2340001);
//        image.setRGB(11, 11, 2340001);
//        image.setRGB(12, 12, 2340001);
        
        try {
            ImageIO.write(image, "PNG", new File("slika.png"));
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
