package KotlinKoans.Collections.Fold

import KotlinKoans.Collections.FlatMap.allOrderedProducts
import KotlinKoans.Collections.FlatMap.orderedProducts
import KotlinKoans.Collections.Product
import KotlinKoans.Collections.Shop

/*
Fold

Implement Shop.getSetOfProductsOrderedByEveryCustomer() using fold.

listOf(1, 2, 3, 4).fold(1, {
    partProduct, element ->
    element * partProduct
}) == 24

 */


// Return the set of products that were ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    return customers.fold(allOrderedProducts,{orderByAll,customer ->orderByAll.intersect(customer.orderedProducts)})
}