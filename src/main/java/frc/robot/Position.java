package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {
  double xCoordinate = 0;
  double yCoordinate = 0;


    public void driveUp() throws InterruptedException {
      driveDistance(1);
      turnDegrees(0);
      yCoordinate++;

    }

	public void driveDown() throws InterruptedException {
      turnDegrees(0);
      driveDistance(-1);
      yCoordinate--;

    }

    public void driveRight() throws InterruptedException {
      turnDegrees(-90);
      driveDistance(1);
      xCoordinate++;
      turnDegrees(90);

    }

    public void driveLeft() throws InterruptedException {
      turnDegrees(90);
      driveDistance(1);
      xCoordinate--;
      turnDegrees(-90);

    }

    public void returnToHome() {

    }

    public String toString() {
        return "Your current position is " + yCoordinate + " inches on the y-axis and " + xCoordinate + " inches on the x-axis.";
    }
}
