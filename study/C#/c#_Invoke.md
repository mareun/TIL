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
    
    void SpawnObject()
    {
        Instantiate(target, new Vector3(0, 2, 0), Quaternion.identity);
    }
}
```