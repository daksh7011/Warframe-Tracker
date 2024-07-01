import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
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

@Preview
@Composable
fun App() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { showContent = !showContent }) {
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