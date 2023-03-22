package mg.pearl.f_statement

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import mg.pearl.f_statement.screen.BstateScreen
import mg.pearl.f_statement.screen.FstateScreen
import mg.pearl.f_statement.screen.InstructionScreen
import mg.pearl.f_statement.screen.NavigateScreen
import mg.pearl.f_statement.ui.theme.F_StateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            F_StateTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    NavigateScreen()

                }
            }
        }
    }
}

