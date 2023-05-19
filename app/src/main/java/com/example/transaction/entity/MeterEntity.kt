package com.example.transaction.entity

import androidx.annotation.StringRes
import com.example.transaction.R

data class MeterEntity(
    @StringRes
    val meterNumber: Int,
    @StringRes
    val meterName: Int,
    @StringRes
    val phoneNumber: Int
)


    val meterData = MeterEntity(meterNumber = R.string.meterNo, meterName = R.string.meterName, phoneNumber = R.string.phoneNo)




