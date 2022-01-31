import java.io.File

data class SigningData(
    val name: String,
    val keystore: File,
    val keystorePassword: String,
    val alias: String,
    val password: String
)

fun <T : BF, U : BT, V : DC, W : PF> CExt<T, U, V, W>.applySigningConfig(vararg configs: SigningData) {
    signingConfigs {
        configs.forEach { config ->
            create(config.name) {
                storeFile = config.keystore
                storePassword = config.keystorePassword
                keyAlias = config.alias
                keyPassword = config.password
            }
        }
    }
}