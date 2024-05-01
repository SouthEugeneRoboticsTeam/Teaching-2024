package org.sert2521.offseason2024

import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.XboxController
import edu.wpi.first.wpilibj2.command.button.JoystickButton
import org.sert2521.offseason2024.commands.ExampleCommand

object Input {
    private val driverController = XboxController(0)
    private val gunnerController = Joystick(1)


    private val exampleButton = JoystickButton(driverController, 1)


    init {
        exampleButton.whileTrue(ExampleCommand())

    }
}