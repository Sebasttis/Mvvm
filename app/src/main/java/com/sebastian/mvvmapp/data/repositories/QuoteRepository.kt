package com.sebastian.mvvmapp.data.repositories

import com.sebastian.mvvmapp.data.model.QuoteModel
import com.sebastian.mvvmapp.data.model.QuoteProvider
import com.sebastian.mvvmapp.data.network.QuoteService

class QuoteRepository {

    private val quoteService = QuoteService()
    suspend fun getAllQuotes():List<QuoteModel>{
        val response = quoteService.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}