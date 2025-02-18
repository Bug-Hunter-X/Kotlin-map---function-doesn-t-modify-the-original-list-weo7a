fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    list.map { it * 2 } //This doesn't change the original list
    println(list) //Output: [1, 2, 3, 4, 5]

    val list2 = mutableListOf(1,2,3,4,5)
    list2.replaceAll { it * 2 }
    println(list2) // Output: [2, 4, 6, 8, 10]
    
    //Alternatively, use map with assignment
    val list3 = mutableListOf(1,2,3,4,5)
    list3.clear()
    list3.addAll(list3.map {it * 2})
    println(list3) //Output: [2, 4, 6, 8, 10]
} 