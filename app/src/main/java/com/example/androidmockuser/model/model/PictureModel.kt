package id.kharozim.androidmockuserapi.model

import com.google.gson.annotations.SerializedName

data class PictureModel(

    @field:SerializedName("thumbnail")
    val thumbnail: String,

    @field:SerializedName("large")
    val large: String,

    @field:SerializedName("medium")
    val medium: String
)