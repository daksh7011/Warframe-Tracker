package compose

import org.jetbrains.compose.resources.StringResource
import warframetracker.composeapp.generated.resources.Res
import warframetracker.composeapp.generated.resources.app_name
import warframetracker.composeapp.generated.resources.fissure_title
import warframetracker.composeapp.generated.resources.nightwave_title
import warframetracker.composeapp.generated.resources.sortie_title

/**
 * Enumeration of all the screens available in the WfTracker application.
 *
 * @property title The title of the screen, as a StringResource.
 */
enum class WfTrackerScreen(val title: StringResource){
    Home(Res.string.app_name),
    Fissures(Res.string.fissure_title),
    Nightwave(Res.string.nightwave_title),
    Sortie(Res.string.sortie_title),
}
