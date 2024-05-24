package org.sert2521.offseason2024

import edu.wpi.first.wpilibj.Joystick
import edu.wpi.first.wpilibj.XboxController
import edu.wpi.first.wpilibj2.command.button.JoystickButton
import org.sert2521.offseason2024.commands.SetWrist

object Input {
    private val driverController = XboxController(0)
    private val gunnerController = Joystick(1)

    private val wristRest = JoystickButton(gunnerController, 2)
    private val wristSetOne = JoystickButton(gunnerController, 3)
    private val wristSetTwo = JoystickButton(gunnerController, 4)


    init {
        wristRest.onTrue(SetWrist(PhysicalConstants.wristAngleRest))
        wristSetOne.onTrue(SetWrist(PhysicalConstants.WristAngleOne))
        wristSetTwo.onTrue(SetWrist(PhysicalConstants.WristAngleTwo))
    }
}

// Hewwo ≧(´▽｀)≦
// Dis Nowoa :3
// Have a nice day :D