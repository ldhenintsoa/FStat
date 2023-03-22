import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import mg.pearl.f_statement.R
@Composable
fun BottonBarComposable(InstructionButton:()-> Unit={},FStateButton:()-> Unit={},BStateButton:()->Unit={}){
    Box(
        modifier = Modifier.background(Color.White)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxWidth()

        )
        {
            IconButton(onClick = { InstructionButton() }) {
                Icon(painter = painterResource(id = R.drawable.ic_baseline_menu_24), contentDescription ="Description")
            }
            IconButton(onClick = { FStateButton()}) {
                Icon(painter = painterResource(id = R.drawable.ic_baseline_import_export_24), contentDescription ="Description")
            }
            IconButton(onClick = {BStateButton() }) {
                Icon(painter = painterResource(id = R.drawable.ic_baseline_museum_24), contentDescription ="Description")
            }
        }
    }
}