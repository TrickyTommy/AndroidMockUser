package id.kharozim.androidmockuserapi.model

import com.google.gson.annotations.SerializedName

data class LocationModel(

    @field:SerializedName("country")
    val country: String,

    @field:SerializedName("city")
    val city: String,

    @field:SerializedName("postcode")
    val postcode: String,

    @field:SerializedName("state")
    val state: String
)