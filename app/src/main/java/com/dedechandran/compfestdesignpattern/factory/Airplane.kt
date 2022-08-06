package com.dedechandran.compfestdesignpattern.factory

class Airplane : Transport {
    override fun deliver(onDeliver: (String) -> Unit) {
        onDeliver.invoke("Your order will be delivered by Airplane")
    }
}