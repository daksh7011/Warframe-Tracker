package com.slothiesmooth.wftracker

import App
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import compose.WfTrackerAppBar
import compose.WfTrackerScreen
import theme.AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            App(
                darkTheme = isSystemInDarkTheme(),
                dynamicColor = true
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppAndroidPreview() {
    App(
        darkTheme = isSystemInDarkTheme(),
        dynamicColor = true
    )
}

@Preview(showBackground = true)
@Composable
fun WfTrackerAppBarPreview() {
    AppTheme {
        WfTrackerAppBar(WfTrackerScreen.Home, true, {})
    }
}