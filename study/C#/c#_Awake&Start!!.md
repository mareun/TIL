Awake and Start
===============
- Awake와 Start는 스크립트가 로드되면 자동으로 호출되는 함수이다.
> 1. Awake()\
     References between scripts, initialisation
> 2. Start()\
     Once script component is enabled
> 3. Update()

- 스크립트 컴포넌트가 비활성화 상태이더라도 Awake는 맨 먼저 호출되며 스크립트와 초기화 사이의 모든 references 설정에 이용된다.
- Start는 Awake다음, 첫 Update 직전에 호출되지만, 스크립트 컴포넌트가 활성화 상태여야 한다. 활성화 상태일때 Start를 이용해 원하는 것을 발생시킨다.\
그러므로 초기화 코드가 실제로 필요할 때까지 모든 부분을 지연시킬 수 있다.
> 1. Awake()\
     Set Ammo for the enemy
> 2. Start()\
     Allow enemy to Shoot
- 예를 들어, 적 캐릭터가 게임에 들어와 Awake를 이용해 자신에게 할당된 탄약 수는 확보할 수 있지만 슈팅 능력을 갖추려면 스크립트 컴포넌트가 활성화 상태인 한정된 시간에 Start를 사용해야 한다.
- Awake와 Start는 오브젝트에 첨부된 스크립트의 유효 기간 중 1회만 호출할 수 있다는 점에 유의해야 한다.
- 따라서 스크립트 비활성화와 재활성화로 Start함수를 반복할 수 없다.

```c#
using UnityEngine;
using System.Collections;

public class AwakeAndStart : MonoBehaviour
{
    void Awake ()
    {
        Debug.Log("Awake called."); 
    }
    
    
    void Start ()
    {
        Debug.Log("Start called.");
    }
}
//비활성화 상태: 'Awake called.'
//활성화 상태: 'Awake called.', 'Start called.'
```
- 스크립트 컴포넌트를 활성화하기 전에 오브젝트 설정을 초기화할 수 있다.
- 스크립트를 여러 개로 나눌 필요가 없다.

***
- Awake()는 생성 하자마자 들어가는 함수이고, Start()는 Awake() 후에 Update() 전에 동작 하는 이벤트 함수.


출처: (https://unity3d.com/kr/learn/tutorials/topics/scripting/awake-and-start?playlist=17117)
