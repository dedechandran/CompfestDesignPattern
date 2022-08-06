package com.dedechandran.compfestdesignpattern.facade

import java.text.SimpleDateFormat
import java.util.*

object DateManager {

    fun convertTimeStampToFormattedDate(timestamp: Long): String {
        val date = Date(timestamp)
        val simpleDateFormat = SimpleDateFormat("dd/mm/yyyy", Locale.getDefault())
        return simpleDateFormat.format(date)
    }
}