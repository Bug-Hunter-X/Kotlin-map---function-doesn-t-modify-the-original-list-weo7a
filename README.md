# Kotlin's `map()` function: A common misconception

This example demonstrates a common misunderstanding when using the `map()` function in Kotlin. Unlike some other languages, `map()` in Kotlin does *not* modify the original list; instead, it returns a *new* list containing the transformed elements. 

The file `bug.kt` shows how this can lead to unexpected results if you expect `map()` to change the original list.
The file `bugSolution.kt` provides a correct implementation if you need to modify the original list directly.