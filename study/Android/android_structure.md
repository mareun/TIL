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
1. **onCreate()**: Activity가 처음 만들어질 때 호출되는 함수이면서, 어플리케이션이 처음 시작할 때 최초로 한번 실행되는 함수. 주로 view를 만들거나 veiw resource bind, data to list 등을 onCreate()에서 담담. 이전 상태의 정보를 담고있는 Bundle을 제공함.
2. **onStart()**: Activity가 다시 시작되기 전, Activity가 멈춘 후, Activity가 사용자에게 보여지기 직전에 호출되는 함수
3. **onResume()**: Activity가 비로소 화면에 보여지는 단계, 사용자에게 Focus를 잡은 상태
4. **onRestart()**: Activity가 멈춰있다가 다시 호출될 때 불리는 함수, 즉 Stopped상태였을 때 다시 호출되어 시작될 때 불림.
5. **onPause()**: Activity위에 다른 Activity가 올라와서 focus를 잃었을 때 호출되는 함수. 완전 Activity가 가려지지 않은 상태에서 호출되는 함수. 영구적인 data는 여기서 저장.
6. **onStop()**: Activity위에 다른 Activity가 완전히 올라와 화면에서 100% 가려질 때 호출되는 함수. 홈키를 누르는 경우. 또는 다른 Activity 페이지 이동이 있는 경ㅇ. 만약 이상태에서 Activity가 다시 불려지면, onRestart()함수가 호출됨.
7. **onDestroy()**: Activity가 완전히 스택에서 없어질 때 호출되는 함수, 즉 제거되는 경우. finish()메소드가 호출되거나, 시스템 메모리 확보를 위해 호출됨.
참고: https://limkydev.tistory.com/32
- **백 스택** : 애플리케이션이 여러 개의 Activity를 가지고 있을 때 새로운 Activity가 호출되면 이전 Activity는 백 스택(Back Stack)에 쌓아 두고 화면에서 가려지므로 보이지 않게 됨. 기기의 Back키가 눌리면 이전 Activity로 돌아가고 스택에서 빠져나옴. 이때 다시 화면에 노출되며 전면에 나타남. 즉 후입선출개념 동작. 만일 Back키를 계속 눌러 더 이상의 Activity가 남아 있지 않으면 애플리케이션은 종료.

```kt
/**안드로이드 콜백 함수에 lateinit사용하기**/
class MainActivity : AppCompatActivity(){
    private lateinit var mWelcomTextView: TextView
    //지연 초기화를 위한 선언
    override fun onCreate(savedInstanceState: Bundle?){
        //앱의 생명주기(생성 시 호출되는 콜백 함수)
        super.onCreate(savedinstanceState)
        setContentView(R.layout.activity_main)

        mWelcomeTextView = findViewById(R.id.msgView) as TextView
        //지연 초기화 시점
    }
}
```
1. **findViewById()** : xml 레이아웃에 설정된 뷰들을 가져오는 메소드. 이를 이용하면, xml에서 적용 시켰던 글자 삽입, 글자 편집과 이벤트 처리가 가능한 메소드 등을 변경할 수 있는 메소드를 지원하게 됨. 즉, 여기서도 View를 만들 수 있다는 말.
2. **lateinit** : 초기화를 나중에 할 경우 lateinit키워드를 변수 선언 앞에 추가해주면 됨. var변수에서만 사용. null값으로 초기화 안됨. 초기화 전에는 변수 사용할 수 없음. Int, Long, Double, Float에는 사용할수 없음.
3. **lazy** : 값을 변경할 수 없는 val사용 가능.
```kt
class MainActivity : AppCompatActivity(){
    private val messageView : TextView by lazy{
        //messageView의 첫 접근에서 초기화
        findViewById(R.id.message_view) as TextView
    }
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedinstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onSayHello(){
        messageView.text="Hello" //이 시점에 초기화됨.
    }
}
```

> startActivityForResult(), onActivityResult()
- **startActivityForResult()**는 이동된 Activity로부터 값을 가져올 때 쓸 수 있음. A Activity에서 B Activity를 호춣하게 되었을 때, B Activity에서 A Activity로 데이터를 전달할 수 있음.
- A Activity가 startActivityForResult를 통해서 B Activity를 호출하면, B는 종료가 되면서 Result값을 통해 Extra 꾸러미를 남김. 그러면 Activity는 Extra꾸러미 안에 있는 데이터들을 꺼내서 사용할 수 있음.
- **A Activity** : int값의 requestCode 값을 설정. -> Intent를 만들어 Activity B를 실행. -> onActiityResult()를 통해 각 requestCode값에 해당하는 결과값을 받아옴.
- **B Activity** : Intent를 만들어 데이터 꾸러미를 Intent에 추가시킴. -> 결과값을 보내면서 Extra 꾸러미를 가지고 있는 Intent를 함께 넘겨줌.

출처: (https://javaexpert.tistory.com/53)

### 메인 스레드
> 메인 스레드
- 메인 스레드는 눈에 보이지 않지만 Activity를 제어함. 메인 스레드가 Activity를 구동시키고 Activity는 View를 그림.
- Service도 메인 스레드가 제어.
> Service
- 눈에 보이지 않는 백그라운드에서 실행됨. 즉, UI가 없는 서비스는 오랫동안 실행되는 작업에 사용됨.
- 애플리케이션내에 서비스가 있다면 startService()나 stopService()로 서비스를 시작하거나 중단할 수 있음.
- 안드로이드는 프로세스(애플리케이션)간 통신 기법으로 운영체제 내부에 있는 Binder라는 요소를 사용. 이는 두 프로세스 간의 메시지를 전달해 줌. 이때 통신에 사용하는 인터페이스를 만들기 위해 AIDL을 이용. 한번 시작된 서비스는 애플리케이션이 종료되고 다른 애플리케이션으로 이동해도 계속 백그라운드에서 실행될 수 있음.
- Service도 생명주기에 해당하는 콜백 함수를 가지고 있음. 생명주기는 startService()로부터 시작되어 onCreate(), onStartCommand()를 호출하고 stopService()에 의해 onDestroy()를 호출. 특히 bindService()의 경우에는 onBind()를 호출하며 unbindService()명령은 onUnbind()콜백 함수를 호출.

### View
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

### 방송 수신자
- 안드로이드에서 발생하는 다양한 이벤트 및 정보를 받고 전달하는 요소. (시스템 부팅, 배터리 부족, 전화/문자 메시지 수신 등)

### 콘텐츠 제공자
- 데이터를 관리하거나 다른 애플리케이션에 데이터를 제공하는 요소. 데이터를 저장하기 위해 SQLite나 파일, 웹 등을 이용할 수 있음. 데이터의 고유한 이름으로 URI를 사용해 구분

### 인텐트
- 안드로이드의 4대 요소 간에 메시지를 전달함. 인텐트는 특정 클래스를 지정하는 명시적 인텐트와 특정 데이터에 대해 수행할 액션을 지정하는 묵시적 인텐트가 있음.
- 묵시적 인텐트는 특정 클래스를 지정하지 않기 때문에 여러 개의 연관된 요소를 호출할 수 있다는 장점.

### 핸들러와 메시지 큐
- 안드로이드의 애플리케이션을 실행하는 순간 메인 스레드가 생성되는데 여기에서 메시지 큐와 루퍼가 항상 자동으로 생성됨.
- UI요소의 갱신과 변경은 오로지 메인 스레드를 통해서만 변경되어야 하는데, 이때 UI요소의 변경 명령은 메인 스레드의 메시지 큐에 차례로 보내 두었다가 하나씩 꺼내 액티비티의 UI 요소를 변경하는 방법을 사용해야함.
- 루퍼(Looper)는 메시지 큐를 반복적으로 들여다보고 있다가 무언가 오면 처리하는 반복 루틴.

