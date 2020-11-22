package id.kharozim.androidmockuserapi.model

import com.google.gson.annotations.SerializedName

data class IdModel(

    @field:SerializedName("name")
    val name: String,

    @field:SerializedName("value")
    val value: Any
)