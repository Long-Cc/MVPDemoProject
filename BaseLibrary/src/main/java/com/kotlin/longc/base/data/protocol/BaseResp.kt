package com.kotlin.longc.base.data.protocol

import com.google.gson.annotations.SerializedName

/**
 * Created by mac on 2019/1/8.
 */
class BaseResp<out T>(@SerializedName("error") val error: Boolean, @SerializedName("results") val results:T)