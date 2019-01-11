Look At
==========
- LookAt을 이용하면 게임 오브젝트의 앞 방향이 세계의 또 다른 변화 쪽으로 향하게 만들 수 있다.

```c#
using UnityEngine;
using System.Collections;

public class CameraLookAt : MonoBehaviour
{
    public Transform target;
    //찾으려는 오브젝트의 reference를 작성
    //Transform형식의 target으로 불리는 변수
    void Update ()
    {
        transform.LookAt(target);
        //transform.LookAt함수를 통해
        //오브젝트에게 target을 바라보라고 명령
    }
}
```
- 카메라 적용 -> 추적할 오브젝트에 드래그