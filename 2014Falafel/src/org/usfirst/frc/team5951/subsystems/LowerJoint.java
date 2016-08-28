package org.usfirst.frc.team5951.subsystems;

import org.usfirst.frc.team5951.robot.Ports;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;

public class LowerJoint {

	private CANTalon lowerJointMotor;

	public LowerJoint() {
		this.lowerJointMotor = new CANTalon(Ports.lowerJoint);
		this.lowerJointMotor.changeControlMode(TalonControlMode.PercentVbus);
		this.lowerJointMotor.enableBrakeMode(true);
	}

	/**
	 * Lifts up the joint
	 */
	public void rotateUp() {
		this.lowerJointMotor.enableBrakeMode(false);
		this.lowerJointMotor.set(0.5);
	}

	/**
	 * Lifts own the joint
	 */
	public void rotateDown() {
		this.lowerJointMotor.enableBrakeMode(false);
		this.lowerJointMotor.set(-0.5);
	}

	/**
	 * enables the breaks
	 */
	public void stop() {
		this.lowerJointMotor.enableBrakeMode(true);
	}

}
