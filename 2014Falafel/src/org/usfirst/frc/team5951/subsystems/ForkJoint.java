package org.usfirst.frc.team5951.subsystems;

import org.usfirst.frc.team5951.robot.Ports;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CANTalon.TalonControlMode;

public class ForkJoint {

	// Talons
	private CANTalon forkMotor;

	/**
	 * Constructor for ForkJoint, initizlizes the Talons and enables their
	 * breaks
	 */
	public ForkJoint() {
		this.forkMotor = new CANTalon(Ports.upperJoint);
		this.forkMotor.changeControlMode(TalonControlMode.PercentVbus);
		this.forkMotor.enableBrakeMode(true);
	}

	/**
	 * Lifts up the fork
	 */
	public void rotateUp() {
		this.forkMotor.enableBrakeMode(false);
		this.forkMotor.set(0.5);
	}

	/**
	 * Lifts own the fork
	 */
	public void rotateDown() {
		this.forkMotor.enableBrakeMode(false);
		this.forkMotor.set(-0.5);
	}

	/**
	 * enables the breaks
	 */
	public void stop() {
		this.forkMotor.enableBrakeMode(true);
	}

}
