package mg.pearl.f_statement.compose

import android.text.Layout.Alignment
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.text.style.TextAlign
import mg.pearl.f_statement.data.Assets
@Composable
fun AssetsCompose(assets:Assets) {
    Row(modifier=Modifier.fillMaxWidth()) {
        Text(text = assets.nameAsset)

        Text(
            text = "${assets.Amount} $",
            textAlign = TextAlign.End,
            modifier = Modifier.fillMaxWidth()
        )
    }
}

