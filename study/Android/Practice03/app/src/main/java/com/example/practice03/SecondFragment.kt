package com.example.practice03

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_second,
            container,
            false
        )
    }

    companion object {
        private val PICK_FROM_ALBUM = 1001
        private val PICK_FROM_CAMERA = 1002
    }

   override fun onActivityCreated(savedInstanceState: Bundle?){
        super.onActivityCreated(savedInstanceState)
        upload_img_btn.setOnClickListener{
            var userP = tedPermission(context1 = context!!)
            userP.checkPer()
            pickfromAlbum()
        }

    }

     private fun pickfromAlbum(){
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, PICK_FROM_ALBUM)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        //super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == PICK_FROM_ALBUM && resultCode == Activity.RESULT_OK){
            //var imgUri : Uri? = null
            var imgUri = data?.data
            Glide.with(this).load(imgUri).into(upload_img_view)
        }
    }
}
