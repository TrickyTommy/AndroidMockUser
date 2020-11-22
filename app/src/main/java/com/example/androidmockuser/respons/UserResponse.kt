package com.example.androidmockuser.respons


import com.google.gson.annotations.SerializedName
import id.kharozim.androidmockuserapi.model.ResponseModel

class UserResponse (
    @field:SerializedName("results")
    val results: List<ResponseModel>,
){

}