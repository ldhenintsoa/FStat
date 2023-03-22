package mg.pearl.f_statement.screen
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import mg.pearl.f_statement.compose.SheetCard


@Composable
fun FstateScreen() {
            Column(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                SheetCard("Income")
                SheetCard(statement = "Expense")
            }

}