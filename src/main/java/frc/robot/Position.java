package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {


    public void driveUp() throws InterruptedException {
      driveDistance();
      turnDegrees();

    }

	public void driveDown() throws InterruptedException {
      turnDegrees(180);
      driveDistance();

    }

    public void driveRight() throws InterruptedException {
      turnDegrees(-90);
      driveDistance();

    }

    public void driveLeft() throws InterruptedException {
      turnDegrees(degrees);
      driveDistance(inches);

    }

    public void returnToHome() {

    }

    public String toString() {
        return "Your current position is ";
    }
}
