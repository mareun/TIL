Invoke
=======
- 일정한 시간 지연 후에 함수의 호출을 예약한다.

```c#
using UnityEngine;
using System.Collections;

public class InvokeScript : MonoBehaviour 
{
    public GameObject target;
    //target이라는 이름의 게임 오브젝트
    
    void Start()
    {
        Invoke ("SpawnObject", 2);
    }
    //Start함수에서 Invoke함수 호출
    //(호출하고 싶은 메소드의 이름(void 타입만 가능), 초단위의 지연 시간 길이)
    
    void SpawnObject()
    {
        Instantiate(target, new Vector3(0, 2, 0), Quaternion.identity);
    }
    //target을 위치 0,2,0에서 instantiate한다.
    //여기서는 2초후에 이 함수가 호출된다.
}
```