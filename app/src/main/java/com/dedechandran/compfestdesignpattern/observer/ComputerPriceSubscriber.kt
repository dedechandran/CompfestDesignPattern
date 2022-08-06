package com.dedechandran.compfestdesignpattern.observer

class ComputerPriceSubscriber(private val onPriceChange: (String) -> Unit) : Subscriber {
    override fun notify(data: Long) {
        onPriceChange.invoke(data.toString())
    }
}