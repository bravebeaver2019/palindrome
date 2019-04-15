# Getting Started

### Running application
Please, run the following command specifying a string argument
```bash
./paindrome 12321
```
### Comments and improvements

* On first attempt I ran across the whole string comparing each element with the mirrored one until I found a difference.

Palindrome.java#10
```java
    for(int i=0; i<length; i++)
```

* On second approach I realised there was no need to run across all the array, just up to the half. By using integer division, both odd and even array lengths should be covered

Palindrome.java#10
```java
    for(int i=0; i<length / 2; i++)
```
