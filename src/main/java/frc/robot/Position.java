package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {
  Romi romiGrid = new Romi();


    public void driveUp() throws InterruptedException {
      romiGrid.driveDistance();
      romiGrid.turnDegrees();

    }

    public void driveDown() throws InterruptedException {
      romiGrid.turnDegrees(180);
      romiGrid.driveDistance();

    }

    public void driveRight() throws InterruptedException {
      romiGrid.turnDegrees(-90);
      romiGrid.driveDistance();

    }

    public void driveLeft() throws InterruptedException {
      romiGrid.turnDegrees(90);
      romiGrid.driveDistance();

    }

    public void returnToHome() {

    }

    public String toString() {
        return "Your current position is ";
    }
}
