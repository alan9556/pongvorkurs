import java.awt.*;

public class SineSimulation extends GraphicsApplication {
    private final double stretchFactor;
    private int passedTime;

    private static final int SCREEN_DIVISIONS_COUNT = 100;
    private static final int START_Y = 200;

    public SineSimulation() {
        this.stretchFactor = (2*Math.PI) / getCanvasSize(); // 2pi / b = p
        this.passedTime = 0;
    }

    @Override
    public void paint(Graphics2D graphics) {
        int divisionFactor = getCanvasSize() / SCREEN_DIVISIONS_COUNT;
        for (int i = 0; i < SCREEN_DIVISIONS_COUNT; i++) {
            int currentX = i*divisionFactor;
            int currentY = calculateY(currentX) + START_Y;
            int nextX = currentX + divisionFactor;
            int nextY = calculateY(nextX) + START_Y;

            graphics.setColor(Color.WHITE);
            graphics.drawLine(currentX, currentY, nextX, nextY);
        }
    }

    private int calculateY(int currentX) {
        int updatedX = currentX; // mach iwas mit update
        int neededStretch = getCanvasSize()/2;
        double result = Math.sin(stretchFactor * updatedX) * neededStretch;
        return (int) result;
    }

    @Override
    public void update(double deltaTime) {
        // in 1 sekunde muss um 400 geschoben werden, 400p/s
    }
}
