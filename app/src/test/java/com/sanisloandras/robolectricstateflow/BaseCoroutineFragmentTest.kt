package com.sanisloandras.robolectricstateflow

import androidx.fragment.app.testing.launchFragment
import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.ext.junit.runners.AndroidJUnit4
import io.mockk.every
import io.mockk.mockk
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.flow.MutableStateFlow
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
abstract class BaseCoroutineFragmentTest {

    private val mockViewModel = mockk<CoroutineViewModel>()

    @Before
    fun before() {
        every { mockViewModel.f1 } returns MutableStateFlow("f1")
        every { mockViewModel.f2 } returns MutableStateFlow("f2")
        every { mockViewModel.f3 } returns MutableStateFlow("f3")
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 1`() {
        launchFragment {
            CoroutineFragment().apply {
                viewModelFactory = ViewModelUtil.createFor(mockViewModel)
            }

        }.onFragment {
            assertEquals(it.f1, "f1")
            assertEquals(it.f2, "f2")
            assertEquals(it.f3, "f3")
        }
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 2`() {
        launchFragment {
            CoroutineFragment().apply {
                viewModelFactory = ViewModelUtil.createFor(mockViewModel)
            }

        }.onFragment {
            assertEquals(it.f1, "f1")
            assertEquals(it.f2, "f2")
            assertEquals(it.f3, "f3")
        }
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 3`() {
        launchFragment {
            CoroutineFragment().apply {
                viewModelFactory = ViewModelUtil.createFor(mockViewModel)
            }

        }.onFragment {
            assertEquals(it.f1, "f1")
            assertEquals(it.f2, "f2")
            assertEquals(it.f3, "f3")
        }
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 4`() {
        launchFragment {
            CoroutineFragment().apply {
                viewModelFactory = ViewModelUtil.createFor(mockViewModel)
            }

        }.onFragment {
            assertEquals(it.f1, "f1")
            assertEquals(it.f2, "f2")
            assertEquals(it.f3, "f3")
        }
    }


    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 5`() {
        launchFragment {
            CoroutineFragment().apply {
                viewModelFactory = ViewModelUtil.createFor(mockViewModel)
            }

        }.onFragment {
            assertEquals(it.f1, "f1")
            assertEquals(it.f2, "f2")
            assertEquals(it.f3, "f3")
        }
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 6`() {
        launchFragment {
            CoroutineFragment().apply {
                viewModelFactory = ViewModelUtil.createFor(mockViewModel)
            }

        }.onFragment {
            assertEquals(it.f1, "f1")
            assertEquals(it.f2, "f2")
            assertEquals(it.f3, "f3")
        }
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 7`() {
        launchFragment {
            CoroutineFragment().apply {
                viewModelFactory = ViewModelUtil.createFor(mockViewModel)
            }

        }.onFragment {
            assertEquals(it.f1, "f1")
            assertEquals(it.f2, "f2")
            assertEquals(it.f3, "f3")
        }
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 8`() {
        launchFragment {
            CoroutineFragment().apply {
                viewModelFactory = ViewModelUtil.createFor(mockViewModel)
            }

        }.onFragment {
            assertEquals(it.f1, "f1")
            assertEquals(it.f2, "f2")
            assertEquals(it.f3, "f3")
        }
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 9`() {
        launchFragment {
            CoroutineFragment().apply {
                viewModelFactory = ViewModelUtil.createFor(mockViewModel)
            }

        }.onFragment {
            assertEquals(it.f1, "f1")
            assertEquals(it.f2, "f2")
            assertEquals(it.f3, "f3")
        }
    }

    @OptIn(InternalCoroutinesApi::class)
    @Test
    fun `WHEN 10`() {
        launchFragment {
            CoroutineFragment().apply {
                viewModelFactory = ViewModelUtil.createFor(mockViewModel)
            }

        }.onFragment {
            assertEquals(it.f1, "f1")
            assertEquals(it.f2, "f2")
            assertEquals(it.f3, "f3")
        }
    }

}

