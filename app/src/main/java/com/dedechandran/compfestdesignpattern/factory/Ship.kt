package com.dedechandran.compfestdesignpattern.factory

class Ship : Transport {

    override fun deliver(onDeliver: (String) -> Unit) {
        onDeliver.invoke("Your order will be delivered by Ship")
    }
}