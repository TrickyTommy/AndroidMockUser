package id.kharozim.androidmockuserapi.model

import android.graphics.Picture
import com.google.gson.annotations.SerializedName


data class ResponseModel(

    @field:SerializedName("nat")
    val nat: String,

    @field:SerializedName("gender")
    val gender: String,

    @field:SerializedName("phone")
    val phone: String,

    @field:SerializedName("dob")
    val dob: DobModel,

    @field:SerializedName("name")
    val name: NameModel,

    @field:SerializedName("location")
    val location: LocationModel,

    @field:SerializedName("id")
    val id: IdModel,

    @field:SerializedName("cell")
    val cell: String,

    @field:SerializedName("email")
    val email: String,

    @field:SerializedName("picture")
    val picture: PictureModel
)


