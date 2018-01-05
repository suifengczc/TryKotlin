package KotlinKoans.Collections.MaxMin

import KotlinKoans.Collections.Customer
import KotlinKoans.Collections.Product
import KotlinKoans.Collections.Shop

/*
// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = TODO()

// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? = TODO()
 */


// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = customers.maxBy { it.orders.size }

// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? = orders.flatMap { it.products }.maxBy { it.price }