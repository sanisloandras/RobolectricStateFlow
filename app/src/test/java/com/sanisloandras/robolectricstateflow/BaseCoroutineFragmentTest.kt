package com.sanisloandras.robolectricstateflow

import androidx.fragment.app.testing.launchFragment
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.lifecycle.Lifecycle
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.mockk.every
import io.mockk.mockk
import io.reactivex.rxjava3.subjects.BehaviorSubject
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
abstract class BaseCoroutineFragmentTest {

    private val mockViewModel = mockk<CoroutineViewModel>(relaxed = true)

    @Before
    fun before() {
        every { mockViewModel.f1 } returns BehaviorSubject.createDefault("f1")
        every { mockViewModel.f2 } returns BehaviorSubject.createDefault("f2")
        every { mockViewModel.f3 } returns BehaviorSubject.createDefault("f3")
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 1`() {
        testBody()
    }

    @OptIn(InternalCoroutinesApi::class)
    private fun testBody() {
        val s = launchFragment {
            CoroutineFragment().apply {
                viewModelFactory = ViewModelUtil.createFor(mockViewModel)
            }

        }.onFragment {
            assertEquals(it.f1, "f1")
            assertEquals(it.f2, "f2")
            assertEquals(it.f3, "f3")
        }
        //s.moveToState(Lifecycle.State.DESTROYED)
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 2`() {
        testBody()
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 3`() {
        testBody()
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 4`() {
        testBody()
    }


    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 5`() {
        testBody()
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 6`() {
        testBody()
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 7`() {
        testBody()
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 8`() {
        testBody()
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 9`() {
        testBody()
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 10`() {
        testBody()
    }

}

