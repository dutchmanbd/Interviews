package com.ticonsys.interviews.presentation.features.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ticonsys.interviews.util.AssetReader
import kotlinx.coroutines.launch

class HomeViewModel(
    private val reader: AssetReader,
) : ViewModel() {

    init {
        loadQuestions()
    }

    private fun loadQuestions() {
        viewModelScope.launch {
            val questionsText = reader.read("questions.json")

        }
    }
}