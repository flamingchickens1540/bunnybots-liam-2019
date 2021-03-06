package org.team1540.liam2019.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.team1540.liam2019.Hardware;

public class Wrist extends Subsystem {

    public void setPosition(double position) {
        Hardware.wrist.set(ControlMode.Position, position);
    }

    public int getPosition() {
        return Hardware.wrist.getSelectedSensorPosition();
    }

    @Override
    protected void initDefaultCommand() {
    }

    public void setPercent(double percent) {
        Hardware.wrist.set(ControlMode.PercentOutput, percent);
    }

    public void zero() {
        Hardware.wrist.set(ControlMode.PercentOutput, 0);
        Hardware.wrist.setSelectedSensorPosition(0);
    }
}
