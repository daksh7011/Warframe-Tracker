package data


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Fissures(
    @SerialName("activation")
    val activation: String,
    @SerialName("active")
    val active: Boolean,
    @SerialName("enemy")
    val enemy: String,
    @SerialName("enemyKey")
    val enemyKey: String,
    @SerialName("eta")
    val eta: String,
    @SerialName("expired")
    val expired: Boolean,
    @SerialName("expiry")
    val expiry: String,
    @SerialName("id")
    val id: String,
    @SerialName("isHard")
    val isHard: Boolean,
    @SerialName("isStorm")
    val isStorm: Boolean,
    @SerialName("missionKey")
    val missionKey: String,
    @SerialName("missionType")
    val missionType: String,
    @SerialName("node")
    val node: String,
    @SerialName("nodeKey")
    val nodeKey: String,
    @SerialName("startString")
    val startString: String,
    @SerialName("tier")
    val tier: String,
    @SerialName("tierNum")
    val tierNum: Int
)
