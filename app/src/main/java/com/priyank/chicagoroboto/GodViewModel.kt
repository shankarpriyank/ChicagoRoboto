package com.priyank.chicagoroboto

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class GodViewModel @Inject
constructor(
    private val userID: String
) : ViewModel() {

    fun showDI(){

    }

}