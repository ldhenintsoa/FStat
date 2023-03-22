package mg.pearl.f_statement.compose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import mg.pearl.f_statement.data.ListeAsset

@Composable
fun SheetCard(statement:String){
    Text(text =statement,
        style = MaterialTheme.typography.h5
    )
    Spacer(modifier = Modifier.size(8.dp))

    Card (
        border = BorderStroke(1.dp, color = Color.Black),
        modifier = Modifier.height(200.dp),
        shape = RoundedCornerShape(30.dp)
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp),
        ){
            items(ListeAsset){ Assets ->
                AssetsCompose(assets = Assets )
            }
        }
    }
    Row(modifier=Modifier.fillMaxWidth()
    ) {
        Text(text = "Total $statement:",
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "200 $",
            textAlign = TextAlign.End,
            modifier = Modifier.fillMaxWidth()
                .padding(end=16.dp)                     ,
            fontWeight = FontWeight.Bold
        )
    }
}
