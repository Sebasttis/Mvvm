package com.sebastian.mvvmapp.data.model

import com.google.gson.annotations.SerializedName

data class DataResponse <TipoGenerico> (
    @SerializedName ("data") val data: TipoGenerico,
    @SerializedName ("status") val status: String,
    @SerializedName ("message") val message: String?
)