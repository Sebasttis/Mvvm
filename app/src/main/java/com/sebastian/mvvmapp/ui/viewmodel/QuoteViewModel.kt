package com.sebastian.mvvmapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sebastian.mvvmapp.data.model.QuoteModel
import com.sebastian.mvvmapp.data.model.QuoteProvider
import com.sebastian.mvvmapp.domain.GetQuotesUseCase
import com.sebastian.mvvmapp.domain.GetRandomQuoteUseCase
import kotlinx.coroutines.launch

class QuoteViewModel : ViewModel() {
    val quoteModel = MutableLiveData<QuoteModel>()
    var isLoading = MutableLiveData<Boolean>()

    val getQuotesUseCase = GetQuotesUseCase()
    var getRandomQuoteUseCase = GetRandomQuoteUseCase()



    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getQuotesUseCase()
            if (!result.isNullOrEmpty()){
                quoteModel.postValue(result[0])
                isLoading.postValue(false)
            }
        }
    }

    fun randomQuote(){
        isLoading.postValue(true)
        val quote = getRandomQuoteUseCase()
        if (quote != null){
            quoteModel.postValue(quote)
        }
        isLoading.postValue(false)



    }
}