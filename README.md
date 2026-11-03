# Sorting Lab

### It is a project organizing 5 of the most popular sorts:
1. Bubble Sort
2. Gnome Sort
3. Insertion Sort
4. Quicksort
5. Merge Sort

*More sorts are coming soon.*

# How the Sorts Work

### Bubble Sort
It is a simple, comparison-based sorting algorithm. It works by repeatedly stepping through a list, comparing adjacent elements, and swapping them if they are in the wrong order. The algorithm gets its name because larger elements gradually "bubble up" to the end of the list with each pass, much like air bubbles rising to the surface of water (the slowest sort out there, by the way).

### Gnome Sort
Gnome sort is a simple sorting algorithm that builds a sorted list one element at a time by comparing adjacent elements and swapping them when they are out of order.

### Insertion Sort
Insertion sort works by dividing a list into a "sorted" and an "unsorted" section, then iteratively taking the first element from the unsorted section and placing it into its correct position within the sorted section. It is exactly like how most people organize a hand of playing cards: you pick up a card, compare it to the cards already in your hand from right to left, and slide it into the correct slot.

### Quicksort
Quicksort is a highly efficient, comparison-based sorting algorithm that operates on the "divide-and-conquer" principle. It breaks a large array down into smaller sub-arrays, sorts them recursively, and rearranges the elements in-place without needing extra storage space.

### Merge Sort
Merge Sort is an efficient, comparison-based sorting algorithm that operates on the "divide-and-conquer" strategy. It works by recursively breaking down a collection of data into individual elements, sorting those individual pieces, and then merging them back together in perfect order. Because it splits the dataset systematically and reconstructs it carefully, it guarantees a highly reliable and predictable runtime.

# Time Complexity Table

| Sort Name      | Best Time  | Average Time | Worst Time | Space Complexity |
| -------------- | ---------- | ------------ | ---------- | ---------------- |
| Bubble Sort    | O(n)       | O(n²)        | O(n²)      | O(1)             |
| Gnome Sort     | O(n)       | O(n²)        | O(n²)      | O(1)             |
| Insertion Sort | O(n)       | O(n²)        | O(n²)      | O(1)             |
| Quicksort      | O(n log n) | O(n log n)   | O(n²)      | O(log n)         |
| Merge Sort     | O(n log n) | O(n log n)   | O(n log n) | O(n)             |

# How to run?
run
`./gradlew test`
in your terminal
