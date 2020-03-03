package com.example.practice04

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ImageData(
    val imageSrc : Int,
    val imageTitle : String
) : Parcelable