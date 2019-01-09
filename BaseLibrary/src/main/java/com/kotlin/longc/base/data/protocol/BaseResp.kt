package com.kotlin.longc.base.data.protocol

/**
 * Created by mac on 2019/1/8.
 */
class BaseResp<out T>(val error: Boolean, val results:T)