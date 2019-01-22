OnMouseDown
===========
- OnMouseDown및 관련 함수는 충돌체에 대한 click이나 GUI 텍스트 요소를 탐지할 수 있다.

```c#
using UnityEngine;
using System.Collections;

public class MouseClick : MonoBehaviour
{
    void OnMouseDown() //OnMouseDown함수
    {
        Debug.Log("Clicked on the Door!");
    }//Click을 하면 콘솔에 찍힘.
}
```