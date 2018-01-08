package KotlinKoans.Builders.HtmlBuilder

/*
Html builder

1. Fill the table with the proper values from the product list. The products are declared in data.kt.

2. Color the table like a chess board (using getTitleColor() and getCellColor() functions above). Pass a color as an argument to the functions tr, td.

You can run 'JavaScript(Canvas)' configuration to see the rendered table.
 */

// TODO() 在JavaScripe(Canvas)环境下测试,pass

//fun renderProductTable(): String {
//    return html {
//        table {
//            tr {
//                td {
//                    text("Product")
//                }
//                td {
//                    text("Price")
//                }
//                td {
//                    text("Popularity")
//                }
//            }
//            val products = getProducts()
//            TODO()
//        }
//    }.toString()
//}
//
//fun getTitleColor() = "#b9c9fe"
//fun getCellColor(row: Int, column: Int) = if ((row + column) %2 == 0) "#dce4ff" else "#eff2ff"