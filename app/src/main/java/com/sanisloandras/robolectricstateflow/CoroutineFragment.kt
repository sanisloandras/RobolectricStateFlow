package com.sanisloandras.robolectricstateflow

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


@InternalCoroutinesApi
class CoroutineFragment : Fragment(R.layout.fragment_coroutine) {

    //@Inject
    var viewModelFactory: ViewModelProvider.Factory = object : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(CoroutineViewModel::class.java)) {
                return CoroutineViewModel() as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }

    }

    private val viewModel: CoroutineViewModel by viewModels { viewModelFactory }

    var f1: String = ""
    var f2: String = ""
    var f3: String = ""


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        launchAndRepeatWithViewLifecycle {
            viewModel.f1.collect {
                f1 = it
            }
        }
        launchAndRepeatWithViewLifecycle {
            viewModel.f2
                .collect {
                    f2 = it
                }
        }
        launchAndRepeatWithViewLifecycle {
            viewModel.f3.collect {
                f3 = it
            }
        }
    }
}

/**
 * Launches a new coroutine and repeats `block` every time the Fragment's viewLifecycleOwner
 * is in and out of `minActiveState` lifecycle state.
 */
inline fun Fragment.launchAndRepeatWithViewLifecycle(
    minActiveState: Lifecycle.State = Lifecycle.State.STARTED,
    crossinline block: suspend CoroutineScope.() -> Unit,
) {
    viewLifecycleOwner.lifecycleScope.launch {
        viewLifecycleOwner.lifecycle.repeatOnLifecycle(minActiveState) {
            block()
        }
    }
}