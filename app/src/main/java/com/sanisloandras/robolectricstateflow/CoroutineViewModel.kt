package com.sanisloandras.robolectricstateflow

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class CoroutineViewModel : ViewModel() {
    val f1 = MutableStateFlow("f1")
    val f2 = MutableStateFlow("f2")
    val f3 = MutableStateFlow("f3")
}