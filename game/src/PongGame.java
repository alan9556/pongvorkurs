import entities.Ball;
import entities.Paddle;

import java.awt.*;

public class PongGame extends GraphicsApplication {
    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private Ball ball;

    public PongGame() {
        this.leftPaddle = new Paddle(20, 150, 100);
        this.rightPaddle = new Paddle(380, 150, 100);
        this.ball = new Ball(200, 20, 5);
    }

    @Override
    public void paint(Graphics2D graphics) {
        leftPaddle.paint(graphics);
        rightPaddle.paint(graphics);
        ball.paint(graphics);
    }
}
