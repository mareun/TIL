package com.example.practice03

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class RVdata(
    val name: String,
    val price: String,
    val score: String,
    val photo: Int
) : Parcelable