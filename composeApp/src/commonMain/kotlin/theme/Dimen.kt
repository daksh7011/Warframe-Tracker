package theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class Dimen(
    val zero: Dp = 0.dp,
    val two: Dp = 2.dp,
    val four: Dp = 4.dp,
    val eight: Dp = 8.dp,
    val twelve: Dp = 12.dp,
    val sixteen: Dp = 16.dp,
    val twenty: Dp = 20.dp,
    val twentyFour: Dp = 24.dp,
    val twentyEight: Dp = 28.dp,
    val thirtyTwo: Dp = 32.dp,
    val thirtySix: Dp = 36.dp,
    val forty: Dp = 40.dp,
    val fortyFour: Dp = 44.dp,
    val fortyEight: Dp = 48.dp,
    val fiftyTwo: Dp = 52.dp,
    val fiftySix: Dp = 56.dp,
    val sixty: Dp = 60.dp,
    val sixtyFour: Dp = 64.dp,
    val sixtyEight: Dp = 68.dp,
    val seventyTwo: Dp = 72.dp,
    val seventySix: Dp = 76.dp,
    val eighty: Dp = 80.dp,
    val eightyFour: Dp = 84.dp,
    val eightyEight: Dp = 88.dp,
    val ninetyTwo: Dp = 92.dp,
    val ninetySix: Dp = 96.dp,
    val oneHundred: Dp = 100.dp,
    val oneHundredFour: Dp = 104.dp,
    val oneHundredEight: Dp = 108.dp,
    val oneHundredTwelve: Dp = 112.dp,
    val oneHundredSixteen: Dp = 116.dp,
    val oneHundredTwenty: Dp = 120.dp,
    val oneHundredTwentyFour: Dp = 124.dp,
    val oneHundredTwentyEight: Dp = 128.dp,
    val oneHundredThirtyTwo: Dp = 132.dp,
    val oneHundredThirtySix: Dp = 136.dp,
    val oneHundredForty: Dp = 140.dp,
    val oneHundredFortyFour: Dp = 144.dp,
)

val LocalDimen = staticCompositionLocalOf { Dimen() }

val MaterialTheme.dimen
    @Composable
    @ReadOnlyComposable
    get() = LocalDimen.current