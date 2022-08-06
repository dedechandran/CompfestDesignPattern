package com.dedechandran.compfestdesignpattern.builder

class Computer(computerBuilder: ComputerBuilder) {
    var motherboard: String = ""
    var psu: String = ""
    var fan: String = ""
    var ram: String = ""
    var cpu: String = ""
    var vga: String = ""

    init {
        this.motherboard = computerBuilder.motherboard
        this.psu = computerBuilder.psu
        this.fan = computerBuilder.fan
        this.ram = computerBuilder.ram
        this.cpu = computerBuilder.cpu
        this.vga = computerBuilder.vga
    }
}