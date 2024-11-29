package com.sebastian.mvvmapp.domain

import com.sebastian.mvvmapp.data.model.QuoteModel
import com.sebastian.mvvmapp.data.repositories.QuoteRepository

class GetQuotesUseCase {

    private  val quoteRepository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = quoteRepository.getAllQuotes()


}