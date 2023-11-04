package com.example.hw5clickbait.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Article(
    @DrawableRes val imageResourceId: Int,
    val newsName: String,
    @StringRes val title: Int,
    val updated: String
)
