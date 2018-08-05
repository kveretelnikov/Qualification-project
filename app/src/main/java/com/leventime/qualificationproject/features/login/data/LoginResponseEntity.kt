package com.leventime.qualificationproject.features.login.data

import com.google.gson.annotations.SerializedName

/**
 * Describe login response data
 *
 * @param token
 * @author kv
 */
class LoginResponseEntity(
        @SerializedName("key")
        var token: String
)