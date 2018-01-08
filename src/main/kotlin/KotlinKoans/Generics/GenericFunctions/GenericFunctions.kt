package KotlinKoans.Generics.GenericFunctions

/*
Generic functions

Make the following code compile by implementing a partitionTo function that splits a collection into two collections according to the predicate.

There is a partition() function in the standard library that always returns two newly created lists.
You should write a function that splits the collection into two collections given as arguments.
The signature of the toCollection() function from the standard library may help you.
 */

//fun partitionTo() = TODO()
//
//fun partitionWordsAndLines() {
//    val (words, lines) = listOf("a", "a b", "c", "d e").
//            partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
//    words == listOf("a", "c")
//    lines == listOf("a b", "d e")
//}
//
//fun partitionLettersAndOtherSymbols() {
//    val (letters, other) = setOf('a', '%', 'r', '}').
//            partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
//    letters == setOf('a', 'r')
//    other == setOf('%', '}')
//}