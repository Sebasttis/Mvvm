package com.sebastian.mvvmapp.data.repositories

import com.sebastian.mvvmapp.data.model.DataResponse
import com.sebastian.mvvmapp.data.model.LoginDTO
import com.sebastian.mvvmapp.data.model.UserModel
import com.sebastian.mvvmapp.data.model.UserProvider
import com.sebastian.mvvmapp.data.network.LoginService


class LoginRepository {
    private val loginService = LoginService()
    suspend fun login(loginDTO: LoginDTO): DataResponse<UserModel> {
        val response = loginService.login(loginDTO)
        if (response.status == "ok") {
            UserProvider.user = response.data

        }
       return response

    }
}