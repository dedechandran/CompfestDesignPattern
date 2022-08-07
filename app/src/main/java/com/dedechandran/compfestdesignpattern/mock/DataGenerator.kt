package com.dedechandran.compfestdesignpattern.mock

object DataGenerator {
    fun generateMotherboardData() = listOf(
        MotherBoard("Mobo Intel", 2000000)
    )

    fun generateCPUData() = listOf(
        CPU("CPU Intel I7", 1000000)
    )

    fun generateVGAData() = listOf(
        VGA("VGA Nvidia GTX", 500000)
    )

    fun generatePSUData() = listOf(
        PSU("PSU Gigabyte", 1000000)
    )

    fun generateRAMData() = listOf(
        RAM("Corsair 16 Gb", 1000000)
    )

    fun generateFanData() = listOf(
        Fan("Noctua", 500000)
    )

    fun generateTransportType() = listOf(
        TransportType.TRUCK,
        TransportType.SHIP,
        TransportType.AIRPLANE
    )
}