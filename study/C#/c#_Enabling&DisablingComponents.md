Enabling and Disabling Components
==============
- unity에서 컴포넌트를 활성화 또는 비활성화하려면 'Enablied'플래그를 사용한다.

```c#
using UnityEngine;
using System.Collections;

public class EnableComponents : MonoBehaviour
{
    private Light myLight;
    //myLight라는 Light reference
    
    void Start ()
    {
        myLight = GetComponent<Light>();//컴포넌트를 오브젝트에 첨부
    }
    
    
    void Update ()
    {
        if(Input.GetKeyUp(KeyCode.Space)) //키가 눌러질 때까지 기다린다
        {
            myLight.enabled = !myLight.enabled;
            //현재상태랑 반대로 전환
            //키가 눌려지면 enabled 플래그를 설정
        }//조명이 켜져있을 때 키보드 입력시 조명이 꺼짐
    }
}
```

출처: (https://unity3d.com/kr/learn/tutorials/topics/scripting/enabling-and-disabling-components?playlist=17117)