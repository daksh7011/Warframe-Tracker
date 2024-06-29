package compose

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.stringResource
import warframetracker.composeapp.generated.resources.Res
import warframetracker.composeapp.generated.resources.back_button

/**
 * Composable to display the app bar.
 *
 * @param currentScreen The current screen being displayed.
 * @param canNavigateBack Whether the user can navigate back to a previous screen.
 * @param navigateUp The callback to navigate up to the previous screen.
 * @param modifier The modifier to be applied to the TopAppBar.
 */
@Composable
fun WfTrackerAppBar(
    currentScreen: WfTrackerScreen,
    canNavigateBack: Boolean,
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(stringResource(currentScreen.title)) },
        modifier = modifier,
        navigationIcon = {
            if (canNavigateBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = stringResource(Res.string.back_button)
                    )
                }
            }
        }
    )
}