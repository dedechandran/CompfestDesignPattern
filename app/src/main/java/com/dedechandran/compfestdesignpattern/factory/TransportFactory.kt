package com.dedechandran.compfestdesignpattern.factory

class TransportFactory {
    companion object {
        fun create(type: TransportType): Transport {
            return when(type) {
                TransportType.TRUCK -> Truck()
                TransportType.SHIP -> Ship()
                TransportType.AIRPLANE -> Airplane()
            }
        }
    }
}