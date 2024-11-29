package com.sebastian.mvvmapp.domain

import com.sebastian.mvvmapp.data.model.QuoteModel
import com.sebastian.mvvmapp.data.model.QuoteProvider


class GetRandomQuoteUseCase {



    operator fun invoke():QuoteModel?{
        val quotes = QuoteProvider.quotes
        if(quotes.isNotEmpty()){
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }
        return null


    }
}