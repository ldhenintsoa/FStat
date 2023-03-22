package mg.pearl.f_statement.data

data class Assets (
    var nameAsset: String,
    var Amount:Int
        )
val Assets1 =Assets("Salary", 50)
val Assets2 =Assets("RealEstate", 50)
val Assets3 =Assets("Ushare", 50)
val Assets4 =Assets("Library", 50)
 var ListeAsset = mutableListOf(
     Assets1,
     Assets2,
     Assets3,
     Assets4
 )