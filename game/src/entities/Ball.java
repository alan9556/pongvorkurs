package entities;

import java.awt.*;

public class Ball {
    private int centerX;
    private int centerY;
    private int radius;

    public Ball(int cx, int cy, int radius) {
        this.centerX = cx;
        this.centerY = cy;
        this.radius = radius;
    }

    public void paint(Graphics2D graphics) {
        graphics.setColor(Color.WHITE);
        graphics.fillOval(centerX, centerY, radius, radius);
    }
}
