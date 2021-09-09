package com.maximcuker.cryptocurrencyinfo.data.remote.dto


import com.google.gson.annotations.SerializedName

data class LinksExtended(
    val stats: Stats,
    val type: String,
    val url: String
)