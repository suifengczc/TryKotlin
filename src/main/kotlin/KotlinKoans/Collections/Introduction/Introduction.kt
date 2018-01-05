package KotlinKoans.Collections.Introduction

import KotlinKoans.Collections.Customer
import KotlinKoans.Collections.Shop

fun Shop.getSetOfCustomers(): Set<Customer> = customers.toSet()