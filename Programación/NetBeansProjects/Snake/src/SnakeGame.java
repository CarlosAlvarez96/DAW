
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.time.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import jdk.jfr.Label;

public class SnakeGame extends Application {

    private static final int GRID_SIZE = 20;
    private static final int CANVAS_WIDTH = 500;
    private static final int CANVAS_HEIGHT = 500;
    private static final int SCOREBOARD_HEIGHT = 50;
    private static final Font SCORE_FONT = new Font("Arial", 20);
    private static final Random RANDOM = new Random();

    private int score;
    private int direction;
    private boolean gameOver;

    private List<Position> snakePositions;
    private Position foodPosition;

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();

        // Create canvas for the game board
        Canvas canvas = new Canvas(CANVAS_WIDTH, CANVAS_HEIGHT);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.setCenter(canvas);

        // Create scoreboard with score label
        Label scoreLabel = new Label("Score: " + score);
        scoreLabel.setFont(SCORE_FONT);
        HBox scoreBox = new HBox(scoreLabel);
        scoreBox.setPrefHeight(SCOREBOARD_HEIGHT);
        scoreBox.setAlignment(Pos.CENTER);
        root.setTop(scoreBox);

        // Initialize game variables
        snakePositions = new ArrayList<>();
        snakePositions.add(new Position(GRID_SIZE / 2, GRID_SIZE / 2));
        direction = KeyCode.RIGHT.getCode();
        spawnFood();
        gameOver = false;

        // Set up game loop
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(0.15), event -> {
            // Move snake
            moveSnake();

            // Check for collision with food
            if (snakePositions.get(0).equals(foodPosition)) {
                score++;
                spawnFood();
                snakePositions.add(snakePositions.get(snakePositions.size() - 1));
            }

            // Check for collision with walls or snake body
            Position head = snakePositions.get(0);
            if (head.getX() < 0 || head.getX() >= GRID_SIZE || head.getY() < 0 || head.getY() >= GRID_SIZE) {
                gameOver();
            } else {
                for (int i = 1; i < snakePositions.size(); i++) {
                    if (head.equals(snakePositions.get(i))) {
                        gameOver();
                        break;
                    }
                }
            }

            // Update scoreboard
            scoreLabel.setText("Score: " + score);

            // Redraw canvas
            drawCanvas(gc);
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);

        // Set up key event handler for changing direction
        canvas.setOnKeyPressed(event -> {
            int newDirection = event.getCode().getCode();
            if (Math.abs(newDirection - direction) != 2) {
                direction = newDirection;
            }
        });

        // Start game
        timeline.play();
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Snake Game");
        primaryStage.show();
    }

    private void moveSnake() {
        Position head = snakePositions.get(0);
        Position newHead = null;
        switch (direction) {
            case KeyCode.UP:
                newHead = new Position(head.getX(), head.getY()




1);
break;
case KeyCode.DOWN:
newHead = new Position(head.getX(), head.getY() + 1);
break;
case KeyCode.LEFT:
newHead = new Position(head.getX() - 1, head.getY());
break;
case KeyCode.RIGHT:
newHead = new Position(head.getX() + 1, head.getY());
break;
}
snakePositions.add(0, newHead);
snakePositions.remove(snakePositions.size() - 1);
}

private void spawnFood() {
int x, y;
do {
x = RANDOM.nextInt(GRID_SIZE);
y = RANDOM.nextInt(GRID_SIZE);
} while (isSnakeAtPosition(x, y));
foodPosition = new Position(x, y);
}

private boolean isSnakeAtPosition(int x, int y) {
for (Position position : snakePositions) {
if (position.getX() == x && position.getY() == y) {
return true;
}
}
return false;
}

private void gameOver() {
gameOver = true;
}

private void drawCanvas(GraphicsContext gc) {
// Clear canvas
gc.setFill(Color.WHITE);
gc.fillRect(0, 0, CANVAS_WIDTH, CANVAS_HEIGHT);

scss
Copy code
  // Draw grid lines
  gc.setStroke(Color.GRAY);
  for (int x = 0; x < CANVAS_WIDTH; x += GRID_SIZE) {
      gc.strokeLine(x, 0, x, CANVAS_HEIGHT);
  }
  for (int y = 0; y < CANVAS_HEIGHT; y += GRID_SIZE) {
      gc.strokeLine(0, y, CANVAS_WIDTH, y);
  }

  // Draw food
  gc.setFill(Color.RED);
  gc.fillRect(foodPosition.getX() * GRID_SIZE, foodPosition.getY() * GRID_SIZE, GRID_SIZE, GRID_SIZE);

  // Draw snake
  gc.setFill(Color.GREEN);
  for (Position position : snakePositions) {
      gc.fillRect(position.getX() * GRID_SIZE, position.getY() * GRID_SIZE, GRID_SIZE, GRID_SIZE);
  }

  // Draw game over message if necessary
  if (gameOver) {
      gc.setFill(Color.BLACK);
      gc.setFont(SCORE_FONT);
      String message = "Game Over! Score: " + score;
      gc.fillText(message, (CANVAS_WIDTH - gc.getFontMetrics().stringWidth(message)) / 2,
              CANVAS_HEIGHT / 2);
  }
}

private static class Position {
private final int x;
private final int y;

csharp
Copy code
  public Position(int x, int y) {
      this.x = x;
      this.y = y;
  }

  public int getX() {
      return x;
  }

  public int getY() {
      return y;
  }

  public boolean equals(Position other) {
      return x == other.getX() && y == other.getY();
  }
}

public static void main(String[] args) {
launch(args);
}
}