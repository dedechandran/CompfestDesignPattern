package com.dedechandran.compfestdesignpattern.observer

class ComputerPricePublisher {
    private val subscribers = mutableListOf<Subscriber>()
    var data: Long = 0L

    fun subscribe(subscriber: Subscriber) {
        subscribers.add(subscriber)
    }

    fun unsubscribe(subscriber: Subscriber) {
        subscribers.remove(subscriber)
    }

    private fun notifySubscribers() {
        subscribers.forEach {
            it.notify(data)
        }
    }

    fun onComputerPriceChanged(data: Long) {
        this.data += data
        notifySubscribers()
    }
}