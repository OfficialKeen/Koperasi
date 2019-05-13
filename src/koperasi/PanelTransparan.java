package koperasi;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

public class PanelTransparan extends JPanel{
    
    private Color color;
    
    public PanelTransparan(){
        setOpaque(false);
        color = new Color(0, 0, 0, 50);
    }
    
    @Override
    public void setBackground(Color background){
        super.setBackground(background);
        
        color = new Color(0, 0, 0, 50);
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
