package mg.pearl.f_statement.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import mg.pearl.f_statement.R

@Composable
fun TopBar (name:String,money:Int,IconClicked:()-> Unit={} ){
    Row(
        modifier = Modifier.padding(start = 8.dp, end = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.photo),
            contentDescription = "photo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(50.dp)
                .clip(CircleShape)
        )
        Spacer(modifier = Modifier.size(16.dp))
        Column {
            Text(
                text = name,
                style = MaterialTheme.typography.h5
            )
            Text(
                text = "Passive Income : $money $",
                style = MaterialTheme.typography.body1
            )
        }
        Spacer(modifier = Modifier.size(130.dp))
        IconButton(onClick = { /*TODO*/ }) {
            Icon(painter = painterResource(id = R.drawable.ic_baseline_more_horiz_24),
                contentDescription = "More")

        }
    }
}