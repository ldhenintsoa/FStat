package mg.pearl.f_statement.screen

import BottonBarComposable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import mg.pearl.f_statement.R

@Composable
fun InstructionScreen (CommencezButton:() -> Unit={}){

            Column(
                modifier = Modifier.padding(0.dp,0.dp,0.dp,60.dp)
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.size(64.dp))
                Image(painter = painterResource(id = R.drawable.photo), contentDescription = "Illustration",modifier=Modifier.clip(RoundedCornerShape(25.dp)).padding(5.dp))
                Spacer(modifier = Modifier.size(16.dp))
                Text(text = "Financial Statement App", style = MaterialTheme.typography.h4, textAlign = TextAlign.Center)
                Text(text = "Fianancial Statement Application "+
                        "developpée pour traquer les transactions entrant "+
                        "et sortant sur une durée de 1 mois. "+
                        "Il y a aussi l'argent cash et les dettes"+
                        "Permer au utilisateur de l'application "+
                        "à prendre conscience de son status financière,"+
                        "et l'améliorer en retour.",
                    style = MaterialTheme.typography.h6, textAlign = TextAlign.Center,modifier=Modifier.padding(10.dp)
                )
                Spacer(modifier = Modifier.size(6.dp))
                Button(onClick = { CommencezButton()}) {
                    Text(text = "Commencez")
                }
            }


}