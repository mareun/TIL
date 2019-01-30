Enumeration
===========
- 상수들의 집합을 변수로 사용할 때
- 가능한 값들을 하위 집합으로 갖는 data type
- 다음 코드는 나침판의 동서남북을 예시로 듦.
- Enumeration은 class의 안이나 밖에서 생성 가능.
- class안에 사용하면 해당 class만 Enumeration을 사용하고, 바깥에 Enumeration이 사용되면 다른 class들도 이 Enumeration에 접근 가능.

```c#
using UnityEngine;
using System.Collections;

public class EnumScript : MonoBehaviour 
{
    enum Direction {North, East, South, West};
    //Enumeration을 선언하는 구문은 "enum"
    //type을 선언한다. 그 이름으로 Direction이라고 할 것이다.

        void Start () 
    {
        Direction myDirection;
        
        myDirection = Direction.North;
    }
    
    Direction ReverseDirection (Direction dir)
    {
        if(dir == Direction.North)
            dir = Direction.South;
        else if(dir == Direction.South)
            dir = Direction.North;
        else if(dir == Direction.East)
            dir = Direction.West;
        else if(dir == Direction.West)
            dir = Direction.East;
        
        return dir;     
    }
}
```