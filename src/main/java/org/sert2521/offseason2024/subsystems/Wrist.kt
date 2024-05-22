package org.sert2521.offseason2024.subsystems

import com.revrobotics.CANSparkLowLevel
import com.revrobotics.CANSparkMax
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import org.sert2521.offseason2024.TunedConstants

object Wrist : SubsystemBase() {
    val wristMotor = CANSparkMax(9 ,CANSparkLowLevel.MotorType.kBrushless)
    val encoder = wristMotor.encoder

    init{
        wristMotor.setSmartCurrentLimit(TunedConstants.WRIST_CURRENT_LIMIT)
    }

    fun setSpeed(speed:Double) {
        wristMotor.set(speed)
    }

    fun setVoltage(voltage:Double) {
        wristMotor.setVoltage(voltage)
    }

    fun getEncoder():Double {
        return encoder.position
    }

    fun stop() {
        wristMotor.stopMotor()
    }
}