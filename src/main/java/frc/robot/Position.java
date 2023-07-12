package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {


    public void driveUp() throws InterruptedException {
      driveDistance(1);
      turnDegrees(0);

    }

	public void driveDown() throws InterruptedException {
      turnDegrees(180);
      driveDistance(1);

    }

    public void driveRight() throws InterruptedException {
      turnDegrees(-90);
      driveDistance(1);

    }

    public void driveLeft() throws InterruptedException {
      turnDegrees(90);
      driveDistance(1);

    }

    public void returnToHome() {

    }

    public String toString() {
        return "Your current position is ";
    }
}
