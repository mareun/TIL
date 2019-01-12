Linear Interpolation
=====================
- Linear Interpolation : 두개의 알려진 값 사이에 위치한 값을 추정한다.
- 'Lerp'라 불리는 function을 사용한다.

### Mathf.Lerp function
```c#
float result = Mathf.Lear(3f, 5f, 0.5f);
//3f: value to interpolate from
//5f: value to interpolat to
//0.5f: how far to interpolate
//0.5 는 50%를 의미한다.
```
- If a final parameter was 0, the function would return the 'from' value and if it was 1 the function would return the 'to' value

***
### Color.Lerp and Vector3.Lerp

- Other examples of Lerp functions include Color.Lerp and Vector3.Lerp.
- These work in exactly the smae way as Mathf.Lerp vut the 'from'and 'to'values are of type Color and Vector3 respectively.

### Vector3.Lerp
```c#
Vector3 from = new Vector3 (1f, 2f, 3f);
Vector3 to = new Vector3 (5f, 6f, 7f);

// Here result = (4, 5, 6)
Vector3 result = Vector3.Lerp (from, to, 0.75f);
```
### Color.Lerp
- The smae principle is applied when using Color.Lerp.
- In the Color struct, colours are represented by 4 floats representing red, blue, green and alpha.

```c#
void Update ()
{
    light.intensity = Mathf.Lerp(light.intensity, 8f, 0.5f);
}//frame rate에 의존

```
- 빛의 강도가 0에서 시작하면 첫 번째 update 후에는 4로 설정. (0~8 사이 50%이므로) 그 다음은 차례로 6, 7, 7.5순으로 설정.
- 즉 변경 속도는 from에 가까워 질수록 느려진다.

```c#
void Update ()
{
    light.intensity = Mathf.Lerp(light.intensity, 8f, 0.5f * Time.deltaTime);
}//per second
```
- Please note that when smoothing value it its often best to use the 'SmoothDamp'function.



***


출처: (https://unity3d.com/kr/learn/tutorials/topics/scripting/linear-interpolation?playlist=17117)
