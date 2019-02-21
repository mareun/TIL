Delegates
=========
- use delegates to provide complex and dynamic functionality in your scripts.
- 변수와 마찬가지로 자신에게 값을 할당할 수 있으며, 이 값들은 런타임 동안 변경될 수 있다.
- 변수와 차이점은, 변수는 data를 보관하지만, Delegate는 함수를 보관한다.

### DelegateScript
```c#
using UnityEngine;
using System.Collections;


public class DelegateScript : MonoBehaviour 
{   
    delegate void MyDelegate(int num);
    //Delegate는 "delegate"키워드를 사용해서 생성.
    // [반환타입][이름][파라미터 list]
    MyDelegate myDelegate; //멤버변수 선언.
    
    

    void Start () 
    {
        myDelegate = PrintNum;
        myDelegate(50);
        
        myDelegate = DoubleNum;
        myDelegate(50);
    }
    
    void PrintNum(int num)
    {
        print ("Print Num: " + num);
    }
    
    void DoubleNum(int num)
    {
        print ("Double Num: " + num * 2);
    }
}
```
