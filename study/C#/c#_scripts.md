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
        if (Input.GetKeyDown(KeyCode.R))
        {
            GetComponent<Renderer> ().material.color = Color.red;
        }
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

