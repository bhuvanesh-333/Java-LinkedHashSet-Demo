# Java LinkedHashSet Demo

Demonstrates **LinkedHashSet** key features from Java Collections Framework:
- Maintains **insertion order** (unlike HashSet)
- **No duplicates** allowed
- Supports **null values**
- Generic types: `Integer`, `String`, `Object`

## Features Shown
- `r.dispaly()`: Integer LinkedHashSet (null + numbers)
- `r.output()`: String LinkedHashSet (null + letters)  
- `r.op()`: Mixed Object LinkedHashSet (strings + integers)

## Sample Output
[null, 1, 2, 3, 5, 6, 7, 8]
[null, a, b, c, d, e]
[a, b, c, 1, 2, 3]
## Key Learnings
| Feature | Behavior |
|---------|----------|
| Duplicates | Rejected (1,1 → 1) |
| Null | Accepted once |
| Order | Insertion order preserved |
| Performance | O(1) add/lookup |

## Run Instructions
1. Clone repo
2. Compile: `javac linkedhashset.java`
3. Execute: `java linkedhashset`

## Tech Stack
Java Collections Framework
LinkedHashSet (Hash table + linked list)
**Bhuvanesh S**  
[LinkedIn](https://linkedin.com/in/bhuvanesh-s-eee) | [GitHub](https://github.com/bhuvanesh-333)  
B.E. Electrical & Electronics | Java Full Stack Practice 
