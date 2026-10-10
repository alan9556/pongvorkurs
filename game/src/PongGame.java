import entities.Ball;
import entities.Paddle;

public class PongGame extends GraphicsApplication {
    private Paddle leftPaddle;
    private Paddle rightPaddle;
    private Ball ball;

    public PongGame() {
        this.leftPaddle = new Paddle(20, 150, 100);
        this.rightPaddle = new Paddle(380, 150, 100);
        this.ball = new Ball(200, 20, 5);
    }

    public static void main(String[] args) {
        PongGame game = new PongGame();
        game.run();
    }


}
