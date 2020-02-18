안드로이드 구성 요소
===================
### Activity
> Activity
- 사용자가 바라보는 인터페이스 화면을 가지고 있는 요소.
- activity_main_xml과 같은 레이아웃 파일로 구성됨.
- Activity는 실제 애플리케이션의 동작을 구현하는 코드가 필요. 코드에서는 사용자의 이벤트를 처리하고 
UI를 갱신. 
> Activity 생명주기
- Activity는 실행의 진입점 역할을 하는 onCreate() 콜백 함수 이외에도 메인 스레드가 제어하기 위한 여러가지 콜백 함수를 호출함.
- 필요에 따라 이런 콜백 함수를 오버라이딩하여 작성해 두어야 함. 이것을 생명주기에 대한 콜백 함수라고 함.
![image](https://user-images.githubusercontent.com/44865268/74729968-a70e8d00-5288-11ea-9e74-2d456090e9d8.png)
1. onCreate(): Activity가 처음 만들어질 때 호출되는 함수이면서, 어플리케이션이 처음 시작할 때 최초로 한번 실행되는 함수. 주로 view를 만들거나 veiw resource bind, data to list 등을 onCreate()에서 담담. 이전 상태의 정보를 담고있는 Bundle을 제공함.
2. onStart(): Activity가 다시 시작되기 전, Activity가 멈춘 후, Activity가 사용자에게 보여지기 직전에 호출되는 함수
3. onResume(): Activity가 비로소 화면에 보여지는 단계, 사용자에게 Focus를 잡은 상태
4. onRestart(): Activity가 멈춰있다가 다시 호출될 때 불리는 함수, 즉 Stopped상태였을 때 다시 호출되어 시작될 때 불림.
5. onPause(): Activity위에 다른 Activity가 올라와서 focus를 잃었을 때 호출되는 함수. 완전 Activity가 가려지지 않은 상태에서 호출되는 함수. 영구적인 data는 여기서 저장.
6. onStop(): Activity위에 다른 Activity가 완전히 올라와 화면에서 100% 가려질 때 호출되는 함수. 홈키를 누르는 경우. 또는 다른 Activity 페이지 이동이 있는 경ㅇ. 만약 이상태에서 Activity가 다시 불려지면, onRestart()함수가 호출됨.
7. onDestroy(): Activity가 완전히 스택에서 없어질 때 호출되는 함수, 즉 제거되는 경우. finish()메소드가 호출되거나, 시스템 메모리 확보를 위해 호출됨.
참고: https://limkydev.tistory.com/32
> 메인 스레드
- 메인 스레드는 눈에 보이지 않지만 Activity를 제어함. 메인 스레드가 Activity를 구동시키고 Activity는 View를 그림.
> View
- View는 보이지 않는 요소와 보이는 요소로 구분됨.
- 보이지 않는 레이아웃 요소는 화면 배치 등을 담당.
- 텍스트 박스나 버튼처럼 눈에 보이는 요소는 위젯(Widget)이라고 불림.

### Example01
```kt
class MainActivity: AppCompatActivity(){
    override fun onCreate(savedinstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
```
- 애플리케이션이 구동되면 메인 스레드가 오버라이딩된 onCreate() 함수를 호출하며 Activity를 시작시킴.
- onCreate()함수는 이제 안드로이드 애플리케이션의 진입점 역할을 하게됨.
- 여기서 super.onCreate()함수에 의해 부모 클래스에서 할 일을 먼저 처리한 후 setContentView()함수를 처리.
- setContentView()함수는 리소스로 존재하는 activity_main.xml 레이아웃 파일을 코드를 통해 변환 처리해 UI를 구성.

