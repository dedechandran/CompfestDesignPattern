package com.dedechandran.compfestdesignpattern.factory

class Truck : Transport {
    override fun deliver(onDeliver: (String) -> Unit) {
        onDeliver.invoke("Your order will be delivered by Truck")
    }
}