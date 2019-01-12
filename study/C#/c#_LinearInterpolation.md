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
