# Getting Started

### Prerequisites
In order to run this program, a java runtime environment must be installed (tested with version 8).

### Building application
Please, run the following command
```bash
./build
```

### Running application
Please, run the following command specifying a string argument
```bash
./palindrome 12321
```

### Comments and improvements
* On first attempt I ran across the whole string comparing each element with the mirrored one until I found a difference.

src/main/java/com/test1/palindrome/Palindrome.java#10
```java
    for(int i=0; i<length; i++)
```

* On a second approach I realised there was no need to run across all the array, just up to the half. By using integer division, both odd and even array lengths should be covered

src/main/java/com/test1/palindrome/Palindrome.java#10
```java
    for(int i=0; i<length / 2; i++)
```

### Alternatives considered
* One possibility would be to split the array in two parts, reverse one of the arrays and compare them but I could not foresee potential increases of performance and more memory would be consumed having to copy the array. 


### Comments and result
The complexity of this problem is linear, finding the solution depends on the size of the array. O(n)
We can easily (and unaccurately due to GC calls) verify this fact by profiling execution time given several array sizes:

| Size                 | Time (ms)     |
| -------------------  | -------------:|
| Integer.MAX_VALUE/4  | 2210          |
| Integer.MAX_VALUE/8  | 597           |
| Integer.MAX_VALUE/16 | 413           |

see: [PalindromeComplexityTest.java](src/test/java/com/test1/palindrome/PalindromeComplexityTest.java)
