package koperasi;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JButton;

public class ButtonTransparan extends JButton{

    private Color color;
    
    public ButtonTransparan(){
        setOpaque(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
        color = new Color(0, 0, 0, 10);
    }
    
    @Override
    public void setBackground(Color background){
        super.setBackground(background);
        
        color = new Color(0, 0, 0, 80);
        repaint();
    }
    
    @Override
    protected void paintComponent(Graphics graphics){
        super.paintComponent(graphics);
        
        Graphics2D graphics2D = (Graphics2D) graphics.create();
        graphics2D.setColor(color);
        graphics2D.fillRect(0, 0, getWidth(), getHeight());
        graphics2D.dispose();
        
    }
}
