// Part 1: Lambda with List Transformation
val sequenceList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val doubledNumbers = sequenceList.map { it * 2 }

// Part 2: Filtering Strings with Lambda
val names = listOf("Alice", "Bob", "Amir", "Charlie", "Annie", "David")
fun filterNames(names: List<String>, filter: (String) -> Boolean): List<String> {
    return names.filter(filter)
}

// Part 3: Sorting with Custom Lambda
val fruits = listOf("Apple", "Banana", "Kiwi", "Strawberry", "Grape")
fun sortedFruits(fruits: List<String>): List<String> {
    return fruits.sortedByDescending { it.length }
}
//  Part 4: Customizing the Filter of a List
fun customFilter(numbers: List<Int>, filter: (Int) -> Boolean): List<Int>{
    return numbers.filter(filter)
}

fun processNumbers(numbers: List<Int>, evenNumbers: (Int) -> Boolean, squaredNumbers: (Int) -> Int): List<Int>{
    return numbers.filter(evenNumbers).map(squaredNumbers)
}

fun main() {
    // Part 1: Lambda with List Transformation
    println(doubledNumbers)

//    // Part 2: Filtering Strings with Lambda
    val filteredNames = filterNames(names) { it.startsWith("A") }
    println(filteredNames)

//    // Part 3: Sorting with Custom Lambda
    println(sortedFruits(fruits))

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//    // Part 4: Customizing the Filter of a List
    println(customFilter(numbers) { it > 5 })
    println(customFilter(numbers) { it % 2 == 0 })
    println(customFilter(numbers) { it % 3 == 0 })

//    Part 5: Combining Lambdas
    println(processNumbers(numbers, { it % 2 != 0 }, {it * it} ))
}