package com.example.transaction.entity

import androidx.annotation.StringRes
import com.example.transaction.R

data class ServiceEntity(
    @StringRes
    val serviceProvider: Int,
    @StringRes
    val product: Int,
    @StringRes
    val address: Int,
    @StringRes
    val timeStamp: Int
    )

val serviceData = ServiceEntity(
    serviceProvider = R.string.serviceProv,
    product = R.string.product,
    address = R.string.address,
    timeStamp = R.string.timestamp
)

