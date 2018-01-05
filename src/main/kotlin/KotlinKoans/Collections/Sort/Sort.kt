package KotlinKoans.Collections.Sort

import KotlinKoans.Collections.Customer
import KotlinKoans.Collections.Shop

/*
Sort

Implement Shop.getCustomersSortedByNumberOfOrders() using sorted or sortedBy.

listOf("bbb", "a", "cc").sorted() == listOf("a", "bbb", "cc")
listOf("bbb", "a", "cc").sortedBy { it.length } == listOf("a", "cc", "bbb")

 */

// Return a list of customers, sorted by the ascending number of orders they made
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> = customers.sortedBy { it.orders.size }