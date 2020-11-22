package id.kharozim.androidmockuserapi.model

import com.google.gson.annotations.SerializedName

data class NameModel(

    @field:SerializedName("last")
    val last: String,

    @field:SerializedName("title")
    val title: String,

    @field:SerializedName("first")
    val first: String
)