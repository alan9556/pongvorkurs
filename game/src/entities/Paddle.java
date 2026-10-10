package entities;

import java.awt.*;

public class Paddle {
    private int topX;
    private int topY;
    private int height;
    public Paddle(int tx, int ty, int height) {
        this.topX = tx;
        this.topY = ty;
        this.height = height;
    }

    public void paint(Graphics2D graphics) {
        int bottomX = topX - height;
        int bottomY = topY - height;
        graphics.setColor(Color.WHITE);
        graphics.drawLine(topX, topY, bottomX, bottomY);
    }
}
