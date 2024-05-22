package org.sert2521.offseason2024.commands

import edu.wpi.first.math.controller.ArmFeedforward
import edu.wpi.first.math.controller.PIDController
import edu.wpi.first.wpilibj2.command.Command
import org.sert2521.offseason2024.TunedConstants
import org.sert2521.offseason2024.subsystems.Wrist

class SetWrist(val wristTarget:Double) : Command() {

    private val wristPID = PIDController(TunedConstants.WRIST_P, TunedConstants.WRIST_I, TunedConstants.WRIST_D)
    private val wristFeedForward = ArmFeedforward(TunedConstants.WRIST_S, TunedConstants.WRIST_G, TunedConstants.WRIST_V, TunedConstants.WRIST_A)

    init {
        // each subsystem used by the command must be passed into the addRequirements() method
        addRequirements(Wrist)
    }

    override fun initialize() {}

    override fun execute() {
        var feedForwardOutput = wristFeedForward.calculate(wristTarget, 0.0)
        var pidOutput = wristPID.calculate(Wrist.getEncoder(), wristTarget)
        Wrist.setVoltage(pidOutput + feedForwardOutput)
    }

    override fun isFinished(): Boolean {
        return false
    }

    override fun end(interrupted: Boolean) {
        Wrist.stop()
    }
}
