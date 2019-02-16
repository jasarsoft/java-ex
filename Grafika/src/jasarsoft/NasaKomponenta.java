
package jasarsoft;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.Calendar;

public class NasaKomponenta extends Component implements MouseMotionListener{

    private int x, y;
    
    public NasaKomponenta(){
        addMouseMotionListener(this);
    }
    
    @Override
    public void print(Graphics g) {
        super.print(g); 
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.WHITE);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        
        g2d.setPaint(Color.BLACK);
        g2d.setStroke(new BasicStroke(2.0f));
        g2d.drawRect(2, 2, getWidth()-4, getHeight()-4);

        Calendar c = Calendar.getInstance();
        int godina = c.get(Calendar.YEAR);
        int mjesec = c.get(Calendar.MONTH);
        int dan = c.get(Calendar.DAY_OF_MONTH);
        
        int sat = c.get(Calendar.HOUR);
        int minut = c.get(Calendar.MINUTE);
        int sekund = c.get(Calendar.SECOND);
        
        g2d.setFont(new Font("Arial", Font.PLAIN, 24));
        String datumIVrijeme = dan + ". " + mjesec + ". " + godina + ". " + sat + "." + minut + "." + sekund;
        g2d.drawString("Vrijeme: " + datumIVrijeme, 40, 50);
        
        g2d.setPaint(Color.RED);
        g2d.fillRect(x - 20, y - 20, 40, 40);
        
        repaint();
    }  

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = e.getX();
        y = e.getY();
    }
}
