package mg.pearl.f_statement.screen
import BottonBarComposable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import mg.pearl.f_statement.compose.TopBar

enum class NavCompose{
    FStateSCreen,
    InstructionScreen,
    BStateScreen,

}


@Composable
fun NavigateScreen(modifier: Modifier = Modifier){
    val navController= rememberNavController()
    Scaffold(
        modifier=modifier,
        topBar = {
        TopBar(name = "Armel", money = 50)
         },
        bottomBar = {
        BottonBarComposable(InstructionButton = {navController.navigate(NavCompose.InstructionScreen.name)}, FStateButton = {navController.navigate(NavCompose.FStateSCreen.name)}, BStateButton = {navController.navigate(NavCompose.BStateScreen.name)})
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = NavCompose.InstructionScreen.name,
            modifier = modifier
                .padding(innerPadding)
                .fillMaxSize()
        )
        {
            composable(route=NavCompose.InstructionScreen.name)
            {
                InstructionScreen (CommencezButton={ navController.navigate(NavCompose.FStateSCreen.name)})
            }

            composable(route=NavCompose.FStateSCreen.name)
            {
                FstateScreen()
            }


            composable(route = NavCompose.BStateScreen.name)
            {
                BstateScreen()
            }



        }
    }}
