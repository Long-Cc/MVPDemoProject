package com.kotlin.longc.login.data.protocol
import com.google.gson.annotations.SerializedName


/**
 * Created by mac on 2019/1/8.
 */
data class LoginResp(
    @SerializedName("_id")
    val _id: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("icon")
    val icon: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("title")
    val title: String
)