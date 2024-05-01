package org.sert2521.offseason2024.commands

import edu.wpi.first.wpilibj2.command.Command

class ExampleCommand : Command() {


    init {
        addRequirements()
    }

    override fun initialize() {}

    override fun execute() {}

    override fun isFinished(): Boolean {
        return false
    }

    override fun end(interrupted: Boolean) {}
}
