package com.sebastian.mvvmapp.data.network

import com.sebastian.mvvmapp.core.RetrofitHelper
import com.sebastian.mvvmapp.data.model.DataResponse
import com.sebastian.mvvmapp.data.model.LoginDTO
import com.sebastian.mvvmapp.data.model.UserModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext

class LoginService {
    private val retrofitTwo = RetrofitHelper.getRetrofitTwo()
    suspend fun login (loginDTO: LoginDTO): DataResponse<UserModel>{

        return withContext(Dispatchers.IO){
            //llamada al API
            val response = retrofitTwo.create(LoginApiClient::class.java).login(loginDTO)
            response.body() ?:
            DataResponse(UserModel( "",  ""),  "error",  "Error")
        }
    }
}