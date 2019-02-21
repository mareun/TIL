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
        //PrintNum 함수를 myDelegate 변수에 할당.
        myDelegate(50); //함수처럼 사용
        
        myDelegate = DoubleNum;
        //DoubleNum 함수를 myDelegate 변수에 할당.
        myDelegate(50); //함수처럼 사용
    }
    
    //다음 두 함수(PrintNum, DoubleNum)는 Delegates에서 선언한 함수와 같이 void 타입이며 단일 정수 파라미터를 가진다.
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

> Result\
Print Num: 50\
Double Num: 100
- Delegates를 사용아혀 어떤 함수를 호출할 것인지 동적으로 제어 가능.
