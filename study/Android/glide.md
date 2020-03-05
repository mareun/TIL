Glide
======
- 구글에서 공개한 이미지 라이브러리.
- 사진 로딩에 특화된 라이브러리로 메모리 절약과 자연스러운 사진 로딩에 사용. gif 사용 가능.

### gradle 추가
```kt
implementation 'com.github.bumptech.glide:glide:4.9.0'
annotationProcessor 'com.github.bumptech.glide:compiler:4.9.0'
```
### import
```kt
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
```

- 3개의 필수 파라미터를 요구함. **Glide.with(context).load(이미지파일).into(ImageView)**
- **with(Context context)** : 안드로이드의 많은 API를 이용하기 위해 필요. Context뿐 아니라 Activity와 Fragment도 인자로 가능.
- **load(String imageUrl)** : 웹 상에서의 이미지 경로 URL 또는 안드로이드 리소스 id 또는 로컬 파일 또는 URI
- **into(Image View targetImageView)** : 다운받은 이미지를 보여줄 이미지 뷰

### practice03에서 RecyclerViewAdapterProduct.kt 예시
```kt
override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val item : RVdata = ProductList[position]

        holder.product_name.text = item.name
        holder.product_price.text = item.price
        holder.product_score.text = item.score
        Glide.with(holder.itemView.context).load(item.photo).into(holder.product_img)
        //item.photo를 product_img 뷰에 넣어줌.
        holder.itemView.setOnClickListener{ProductClick(item)}
    }
```