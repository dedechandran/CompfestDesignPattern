package com.dedechandran.compfestdesignpattern.factory

interface Transport {
    fun deliver(onDeliver: (String) -> Unit)
}