Function
========
- 함수 구조
```kt
/**함수 선언**/
fun sum(a: Int, b:Int): Int 
//함수키워드 이름(매개변수): 반환값
{
    var sum = a+b
    return sum
}

/**프린트**/
fun printSum(a: Int, b:Int): Unit
//Unit은 반환값이 없을 때 사용. Unit 안써도됨.
{
    println("sum of $a and $b is ${a+b}")
}
```
- Unit은 특수한 객체를 반환. void는 정말 아무것도 반환하지 않음.


> 순수함수
- 만일 어떤 함수가 같은 인자에 대하여 항상 같은 겨로가를 반환하면 '부작용이 없는 함수'라고 하고, 부작용이 없는 함수가 함수 외부의 어떤 상태도 바꾸지 않는다면 순수함수라고 부른다.
1. 같은 인자에 대하여 항상 같은 값을 반환한다.
2. 함수 외부의 어떤 상태도 바꾸지 않는다.
```kt
fun sum(a: Int, b:Int) : Int
{
    return a+b
}
//동일한 인자인 a, b를 입력받아 항상 a+b를 출력(부작용이 없음.)
```

> 람다 함수
- 함수형 프로그래밍의 람다식은 다른 함수의 인자로 넘기는 함수, 함수의 결괏값으로 반환하는 함수, 변수에 저장하는 함수를 말한다.
- 일급 객체의 특징을 가지고 있다.
1. 일급 객체는 함수의 인자로 전달할 수 있다.
2. 일급 객체는 함수의 반환값에 사용할 수 있다.
3. 일급 객체는 변수에 담을 수 있다.
```kt
val multi: (Int, Int) -> Int = {x: Int, y: Int -> x * y}
//변수: 람다식 자료형선언 = {람다식 매개변수 -> 람다식 처리내용}
```
```kt
fun main()
{
    var result: Int
    val multi = {x: Int, y: Int -> x * y}
    //일반 변수에 람다식 할당
    result=multi(10,20)
    //람다식이 할당된 변수는 함수처럼 사용 가능
    println(result)
}
```
- ->이후의 표현식이 여러 줄인 경우 마지막 표현식이 반환.
> 고차 함수
- 다른 함수를 인자로 사용하거나 함수를 결괏값으로 반환하는 함수. 일급 객체 혹은 일급 함수를 서로 주고받을 수 잇는 함수가 고차 함수가 됨.
```kt
fun main()
{
    println(highFunc({x, y -> x + y}, 10, 20))
}//람다식 함수를 인수로 넘김.
fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a, b)
```
```kt
/**매개변수에 람다식 함수를 이용한 고차 함수**/
fun main()
{
    var result: Int
    result = highOrder({x, y -> x + y}, 10, 20)
    println(result)
}

fun highorder(sum: (Int, Int) -> Int, a: Int, b: Int): Int
{
    return sum(a, b)
}

```kt
/**다른 함수의 참조에 의한 일반 함수 호출**/
fun sum(a: Int, b: Int) = a + b
fun text(a: String, b: String) = "Hi! $a $b"
fun funcParam(a: Int, b: Int, c: (Int, Int)->Int): Int
{
    return c(a, b)
}
fun hello(body: (String, String)-> String): Unit
{
    println(body("Hello", "World"))
}

fun main()
{
    val res1= = funcParam(3, 2, ::sum)
    println(res1)

    hello(::text)

    val likeLambda = ::sum
    println(likeLambda(6, 6))
}