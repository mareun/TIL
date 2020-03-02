Inflate
========
#### Inflation의 기능
```kt
 override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(
            R.layout.rv_data_list_item,
            parent,
            false
        )
        //LayoutInflater 클래스의 용도는 xml 리소스를 전개하여 뷰 객체를 만든다.
        return RecyclerViewHolder(view)
    }
```
- xml 문서에 정의된 layout과 child view의 속성을 읽어 실제 view 객체를 생성해 내는 동작.
- layout xml에 명시한 위젯이 안드로이드 메모리에 생성되는 과정.
- layout의 정보대로 객체를 생성하고 속성 변경 메서드를 순서대로 호출하는 것.
- 미리 xml로 만들어 놓고 코드에서는 inflater를 활용하여 바로 ciew를 생성하는 느낌.
- Activity 화면에서 사용자 인터페이스를 정의한 xml을 view 해줘야 하는데, 이 때 infalte 메소드를 통해서 이러한 xml 리소스의 정보를 해석하여 view를 생성하고 rootview를 리턴.
- 리턴된 rootview를 setContentView()라는 메소드를 통해 보여줄 수 있음.