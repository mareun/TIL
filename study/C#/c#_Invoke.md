Invoke
=======
- 일정한 시간 지연 후에 함수의 호출을 예약한다.

### Invoke
- 함수를 1회 호출할 때 사용한다.

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


***

### InbokeRepeating
- 함수를 여러번 반복하여 호출할 때 사용한다.
```c#
using UnityEngine;
using System.Collections;

public class InvokeRepeating : MonoBehaviour 
{
    public GameObject target;
    
    
    void Start()
    {
        InvokeRepeating("SpawnObject", 2, 1);
    }
    //(호출하고 싶은 메소드의 이름(void 타입만 가능), 초단위의 지연 시간 길이, 첫 호출 후 후속 호출 사이의 대기 시간)
    
    void SpawnObject()
    {
        float x = Random.Range(-2.0f, 2.0f);
        float z = Random.Range(-2.0f, 2.0f);
        //랜덤한 x와 z위치
        Instantiate(target, new Vector3(x, 2, z), Quaternion.identity);
    }
    //여기서 2초후에 함수 실행.
    // 그 후에는 1초마다 다시 호출 된다.
}
```
- 이러한 경우에는 함수가 무한히 실행이 된다.

```c#
void Start()
{
    InvokeRepeating("SpawnObject", 2, 1);
    CancelInvoke("SpawnObject"); //특정 함수를 중지 시킬 때
}
```

출처: (https://unity3d.com/kr/learn/tutorials/topics/scripting/invoke?playlist=17117)


