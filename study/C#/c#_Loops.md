Loops
=====
- c#의 반복문들 중에는 ForLoop, WhileLoop, DoWhileLoop, ForeachLoop문이 있다.

### ForeachLoop
- 배열이나 컬렉션에서 각 요소를 얻어오는 구문이다.

```c#
using UnityEngine;
using System.Collections;

public class ForeachLoop : MonoBehaviour 
{   
    void Start () 
    {
        string[] strings = new string[3];
        
        strings[0] = "First string";
        strings[1] = "Second string";
        strings[2] = "Third string";
        
        foreach(string item in strings) //strings 배열의 각 배열값을 얻어온다.
        {
            print (item);
        }
    }
}
```
- 예로 for문 구문에서 배열의 각 값들을 얻어올 때 보다. 더 간단하게 사용가능하다.
- 특히 다중배열(2차원, 3차원 등)을 처리할 때 for문은 이중for문 등으로 Loop를 돌리지만 foreach는 단순한 문장으로 처리할 수 있다.

출처: (https://unity3d.com/kr/learn/tutorials/topics/scripting/loops?playlist=17117)