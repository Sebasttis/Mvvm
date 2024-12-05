package com.sebastian.mvvmapp.data.network

import com.sebastian.mvvmapp.data.model.DataResponse
import com.sebastian.mvvmapp.data.model.LoginDTO
import com.sebastian.mvvmapp.data.model.UserModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApiClient {
    @POST("sign_in")

    suspend fun login (
        @Body loginDTO: LoginDTO

    ): Response<DataResponse<UserModel>>

}