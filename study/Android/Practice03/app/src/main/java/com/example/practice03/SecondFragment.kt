package com.example.practice03

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
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
/*
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        upload_img_btn.setOnClickListener{
            var userP = tedPermission(requireContext())
            userP.checkPer()
        }

    }*/

    /* private fun pickfromAlbum(){
        val intent = Intent(Intent.ACTION_PICK)
        intent.type = "image/*"
        startActivityForResult(intent, PICK_FROM_ALBUM)
    }*/

}
}? 뭐징
    */
}