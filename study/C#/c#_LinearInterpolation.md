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

***
