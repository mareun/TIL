Scope and Access Modifiers
================
### ScopeAndAccessModifiers
```c#
using UnityEngine;
using System.Collections;

public class ScopeAndAccessModifiers : MonoBehaviour
{
    public int alpha = 5;
    
    
    private int beta = 0;
    private int gamma = 5;
    
    
    private AnotherClass myOtherClass;
    
    
    void Start ()
    {
        alpha = 29;
        
        myOtherClass = new AnotherClass();
        myOtherClass.FruitMachine(alpha, myOtherClass.apples);
        //FruitMachine에 접근한다.
    }
    
    
    void Example (int pens, int crayons)
    {
        int answer;
        answer = pens * crayons * alpha;
        Debug.Log(answer);
    }
    
    
    void Update ()
    {
        Debug.Log("Alpha is set to: " + alpha);
    }
}
```
### AnotherClass
```c#
using UnityEngine;
using System.Collections;

public class AnotherClass
{
    public int apples;
    public int bananas;
    
    
    private int stapler;
    private int sellotape;
    
    
    public void FruitMachine (int a, int b)
    {
        int answer;
        answer = a + b;
        Debug.Log("Fruit total: " + answer);
    }
    
    
    private void OfficeSort (int a, int b)
    {
        int answer;
        answer = a + b;
        Debug.Log("Office Supplies total: " + answer);
    }
}
```
- 클래스 변수나 함수등에 접근 제한을 두는 public이나 private는 c++에서처럼 동작 한다.
- 이 두개의 클래스가 파일?이 나뉘어져 있다해도, 예전에 c++에서 include같은 참조는 안해도 되는 것 같다.?
