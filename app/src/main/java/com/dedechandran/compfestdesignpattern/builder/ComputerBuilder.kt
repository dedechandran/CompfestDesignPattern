package com.dedechandran.compfestdesignpattern.builder

class ComputerBuilder {
    var motherboard: String = ""
    var psu: String = ""
    var fan: String = ""
    var ram: String = ""
    var cpu: String = ""
    var vga: String = ""

    fun setMotherBoard(motherboard: String) = apply {
        this.motherboard = motherboard
    }

    fun setPsu(psu: String) = apply {
        this.psu = psu
    }

    fun setFan(fan: String) = apply {
        this.fan = fan
    }

    fun setRam(ram: String) = apply {
        this.ram = ram
    }

    fun setCpu(cpu: String) = apply {
        this.cpu = cpu
    }

    fun setVga(vga: String) = apply {
        this.vga = vga
    }

    fun build() = Computer(this)
}