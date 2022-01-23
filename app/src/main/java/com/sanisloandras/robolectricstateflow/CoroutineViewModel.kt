package com.sanisloandras.robolectricstateflow

import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.subjects.BehaviorSubject
import kotlinx.coroutines.flow.MutableStateFlow

class CoroutineViewModel : ViewModel() {
    val f1 = BehaviorSubject.createDefault("f1")
    val f2 = BehaviorSubject.createDefault("f2")
    val f3 = BehaviorSubject.createDefault("f3")
}