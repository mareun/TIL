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
    //배열을 선언하는 것처럼 다양한 상수를 콤마로 구분하여 {}에 넣는다.
    //값들은 {0, 1, 2, 3}이렇게 갖게 된다.

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

```c#
    enum Direction {North, East, South, West};
    //{0, 1, 2, 3}
    enum Direction {North = 1, East, South, West};
    //{1, 2, 3, 4}
    enum Direction {North = 7, East = 3, South = 1, West = 2};
    //{7, 3, 1, 2}
    enum Direction : short {North , East, South, West};
    //int타입이 아닌 short 타입으로 선언
```
- Enumeration에서 선언된 각각의 상수는 기본적으로 0부터 시작하는 정수값을 하나씩 가지고 있다. 그 정수값은 집합 안에서 증가한다. (배열의 자리같은 느낌으로!)
- 값의 type과 값 자체는 필요하다면 둘 다 오버라이드 할 수 있다. 만일 여기서 North = 1로 선언한다면 그 다음은 2, 3, 4 차례로 값을 가지게 된다.
- 또는 값을 각자 따로 지정해 줄 수도 있다.