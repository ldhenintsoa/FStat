package mg.pearl.f_statement.screen

import BottonBarComposable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import mg.pearl.f_statement.compose.SheetCard
import mg.pearl.f_statement.compose.TopBar

@Composable
fun BstateScreen() {
            Column(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                SheetCard("Asset")
                SheetCard(statement = "Loans")
            }
        }

