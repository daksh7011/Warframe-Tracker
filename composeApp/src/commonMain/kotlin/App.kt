import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import data.Fissures
import kotlinx.coroutines.launch
import org.jetbrains.compose.ui.tooling.preview.Preview
import theme.AppTheme

@Preview
@Composable
fun App(
    darkTheme: Boolean,
    dynamicColor: Boolean,
) {
    AppTheme(
        darkTheme = darkTheme,
        dynamicColor = dynamicColor
    ) {
        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier.fillMaxWidth()
                .background(MaterialTheme.colorScheme.background),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = { showContent = !showContent }
            ) {
                Text("Click me!")
            }
            AnimatedVisibility(showContent) {
                val scope = rememberCoroutineScope()
                var fissureList: List<Fissures> by remember { mutableStateOf(emptyList()) }
                LaunchedEffect(true) {
                    scope.launch {
                        fissureList = try {
                            Greeting().getFissuresData()
                        } catch (e: Exception) {
                            emptyList()
                        }
                    }
                }
                LazyColumn(modifier = Modifier.padding(16.dp)) {
                    items(
                        items = fissureList,
                        key = { fissure -> fissure.id }
                    )
                    { fissure ->
                        FissureCardItem(fissure = fissure, modifier = Modifier.fillMaxWidth())
                        Spacer(modifier = Modifier.fillMaxWidth().size(16.dp))
                    }
                }
            }
        }

    }
}


@Composable
fun FissureCardItem(
    fissure: Fissures,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text("Node: ${fissure.node}")
            Text("MissionType: ${fissure.missionType}")
            Text("Tier: ${fissure.tier}")
            Text("ETA: ${fissure.eta}")
        }
    }
}