package com.example.transaction.entity

import androidx.annotation.StringRes
import com.example.transaction.R

data class PaymentEntity(
    @StringRes
    val amount: Int,
    @StringRes
    val numOfUnit: Int,
    @StringRes
    val servCharge: Int
)

val paymentData = PaymentEntity(
    amount = R.string.amount,
    numOfUnit = R.string.numOfUnit,
    servCharge = R.string.serviceCharge
)
