Variables and Functions
========================
```c#
using UnityEngine;
using System.Collections;

public class VariablesAndFunctions : MonoBehaviour
{   
    int myInt = 5; //변수 선언 및 init
    
    
    void Start () //함수 선언
    {
        myInt = MultiplyByTwo(myInt);
        Debug.Log (myInt); //콘솔 창에 보여줌
    }
    
    
    int MultiplyByTwo (int number) //myInt를 넘김
    {
        int ret;
        ret = number * 2;
        return ret; //10이 반환
    }
}
```
변수와 함수의 쓰임은 그동안 배웠던 언어들?에서 많이 다르지 않은 것 같다.\
출처: (https://unity3d.com/kr/learn/tutorials/topics/scripting/variables-and-functions?playlist=17117)
