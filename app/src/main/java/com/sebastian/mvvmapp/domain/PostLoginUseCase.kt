package com.sebastian.mvvmapp.domain

import com.sebastian.mvvmapp.data.model.DataResponse
import com.sebastian.mvvmapp.data.model.LoginDTO
import com.sebastian.mvvmapp.data.model.UserModel
import com.sebastian.mvvmapp.data.repositories.LoginRepository

class PostLoginUseCase {
    private val loginRepository = LoginRepository()
    suspend operator fun invoke(loginDTO: LoginDTO): DataResponse<UserModel> {
        return loginRepository.login(loginDTO)
    }

}