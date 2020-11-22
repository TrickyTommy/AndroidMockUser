package com.example.androidmockuser.model

import com.google.gson.annotations.SerializedName

data class ResponseData(

	@field:SerializedName("results")
	val results: List<ResultsItem>,

	@field:SerializedName("info")
	val info: Info
)

data class Timezone(

	@field:SerializedName("offset")
	val offset: String,

	@field:SerializedName("description")
	val description: String
)

data class Id(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("value")
	val value: String
)

data class Name(

	@field:SerializedName("last")
	val last: String,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("first")
	val first: String
)

data class Dob(

	@field:SerializedName("date")
	val date: String,

	@field:SerializedName("age")
	val age: Int
)

data class Coordinates(

	@field:SerializedName("latitude")
	val latitude: String,

	@field:SerializedName("longitude")
	val longitude: String
)

data class Picture(

	@field:SerializedName("thumbnail")
	val thumbnail: String,

	@field:SerializedName("large")
	val large: String,

	@field:SerializedName("medium")
	val medium: String
)

data class Location(

	@field:SerializedName("city")
	val city: String,

	@field:SerializedName("street")
	val street: String,

	@field:SerializedName("timezone")
	val timezone: Timezone,

	@field:SerializedName("postcode")
	val postcode: String,

	@field:SerializedName("coordinates")
	val coordinates: Coordinates,

	@field:SerializedName("state")
	val state: String
)

data class Registered(

	@field:SerializedName("date")
	val date: String,

	@field:SerializedName("age")
	val age: Int
)

data class Login(

	@field:SerializedName("sha1")
	val sha1: String,

	@field:SerializedName("password")
	val password: String,

	@field:SerializedName("salt")
	val salt: String,

	@field:SerializedName("sha256")
	val sha256: String,

	@field:SerializedName("uuid")
	val uuid: String,

	@field:SerializedName("username")
	val username: String,

	@field:SerializedName("md5")
	val md5: String
)

data class ResultsItem(

	@field:SerializedName("nat")
	val nat: String,

	@field:SerializedName("gender")
	val gender: String,

	@field:SerializedName("phone")
	val phone: String,

	@field:SerializedName("dob")
	val dob: Dob,

	@field:SerializedName("name")
	val name: Name,

	@field:SerializedName("registered")
	val registered: Registered,

	@field:SerializedName("location")
	val location: Location,

	@field:SerializedName("id")
	val id: Id,

	@field:SerializedName("login")
	val login: Login,

	@field:SerializedName("cell")
	val cell: String,

	@field:SerializedName("email")
	val email: String,

	@field:SerializedName("picture")
	val picture: Picture
)

data class Info(

	@field:SerializedName("seed")
	val seed: String,

	@field:SerializedName("page")
	val page: Int,

	@field:SerializedName("results")
	val results: Int,

	@field:SerializedName("version")
	val version: String
)
