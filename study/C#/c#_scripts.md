Scripts as Behaviour Components
=========
- unity에서는 스크립트를 동작 컴포넌트로 간주한다.
- 스크립트를 오브젝트에 적용해 인스펙터에서 확인할 수 있다.

### 예제#1
- 오브젝트의 기본 재질의 색상 값에 영향을 주어 큐브의 색상을 바꾼다.
```c#
using UnityEngine;
using System.Collections;

public class ExampleBehaviourScript : MonoBehaviour
{
    void Update()
    {
        if (Input.GetKeyDown(KeyCode.R)) //키보드에서 R키 입력받음
        {
            GetComponent<Renderer> ().material.color = Color.red;
        }//색상이 Red로 변경
        if (Input.GetKeyDown(KeyCode.G))
        {
            GetComponent<Renderer>().material.color = Color.green;
        }
        if (Input.GetKeyDown(KeyCode.B))
        {
            GetComponent<Renderer>().material.color = Color.blue;
        }
    }
}
```
여기에서 다음 코드의 동작을 보자면,
```c#
gameObject.renderer.material.color = Color.red;
//GetComponent<Renderer> ().material.color = Color.red;
```
( 게임 오브젝트를 참조할 때 "gameObject"라는 스크립틀르 첨부하면 이 item을 참조 할 수 있다. )\

1. gameObject라는 스크립트가 첨부된 게임 오브젝트에 접근
2. renderer에 접근
3. 그 renderer에 첨부된 재질(meterial)에 접근
4. 그 재질(meterial)의 색상(color)에 접근
5. 색상(Color)클래스의 red로 바로가기 설정

출처: (https://unity3d.com/kr/learn/tutorials/modules/beginner/scripting/scripts-as-behaviour-components?playlist=17117)