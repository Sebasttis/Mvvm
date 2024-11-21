package com.sebastian.mvvmapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sebastian.mvvmapp.model.QuoteModel
import com.sebastian.mvvmapp.model.QuoteProvider

class QuoteViewModel : ViewModel() {

     val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}