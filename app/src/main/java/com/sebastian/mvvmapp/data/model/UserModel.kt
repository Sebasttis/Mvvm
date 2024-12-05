package com.sebastian.mvvmapp.data.model

import com.google.gson.annotations.SerializedName

data class UserModel (
    @SerializedName("name") val name: String,
    @SerializedName("last_name") val last_name: String,

)
