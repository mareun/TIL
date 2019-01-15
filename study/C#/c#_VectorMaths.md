Vector Maths
=============
- Magnitude : 벡터의 길이
- Velocity : 시간에 따른 위치의 변화.
움직이는 Objects는 Veloity를 가진다. 
- Unity에서는 왼손 좌표계를 사용한다.

![image](https://user-images.githubusercontent.com/44865268/50893113-79c79c80-1443-11e9-8166-0dfe7497e838.png)

<img width="430" alt="screenshot1" src="https://user-images.githubusercontent.com/44865268/50723127-dd3c8c00-111c-11e9-9e2b-b711629e22af.PNG">

- **Vector3.magnitude** 함수로 위 사진의 Magnitude계산을 수행한다.

참고: [Vector3](https://docs.unity3d.com/ScriptReference/Vector3.html?_ga=2.3051696.1014157617.1546605019-1821101929.1546605019)
***
### Dot Product
- 두 벡터의 값을 곱하여 더함(내적). 스칼라이다.
- 두 벡터가 서로 직각인지 판단.(값이 0일때 직각이다.)


<img width="366" alt="screenshot1" src="https://user-images.githubusercontent.com/44865268/50723191-d9f5d000-111d-11e9-9cce-b7aa64711c6d.PNG">

- **Vector3.Dot(VectorA, VercotrB)** 함수로 Dot Product값을 구할 수 있다.

#### 예시
> 비행기\
내적값이 0: 수평\
내적값이 0이하: 상승\
 내적값이 0이상: 하강

참고: [Vector3.Dot](https://docs.unity3d.com/ScriptReference/Vector3.Dot.html?_ga=2.7846322.1014157617.1546605019-1821101929.1546605019)

***
### Cross Product
- 벡터의 외적인듯 하다.
- 결과값은 스칼라값이 아닌 벡터값이다.

![image](https://user-images.githubusercontent.com/44865268/50723405-abc5bf80-1120-11e9-812e-b93bd15ec852.png)

- **Vector3.Cross(VectorA, VectorB)** 함수로 Cross Product값을 구할 수 있다.

참고: [Vector3.Cross](https://docs.unity3d.com/ScriptReference/Vector3.Cross.html?_ga=2.217947158.1014157617.1546605019-1821101929.1546605019)

#### 예시
> 탱크\
외적 값을 통해 탱크의 회전축을 파악하여 대포를 쏠 방향을 제시

출처: (https://unity3d.com/kr/learn/tutorials/topics/scripting/vector-maths?playlist=17117)
