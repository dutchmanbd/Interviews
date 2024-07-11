package com.ticonsys.interviews.presentation.features.home

import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ticonsys.interviews.util.WindowInfo
import com.ticonsys.interviews.util.rememberWindowInfo

@RootNavGraph(start = true)
@Destination
@Composable
fun HomeScreen() {

    val windowInfo = rememberWindowInfo()

    if (windowInfo.screenWidthInfo is WindowInfo.WindowType.Compact) {

    } else {

    }
}