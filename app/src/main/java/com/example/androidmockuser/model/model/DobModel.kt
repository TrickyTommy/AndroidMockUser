package id.kharozim.androidmockuserapi.model

import com.google.gson.annotations.SerializedName

data class DobModel(

    @field:SerializedName("date")
    val date: String,

    @field:SerializedName("age")
    val age: Int
)