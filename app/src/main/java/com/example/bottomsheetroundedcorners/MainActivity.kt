package com.example.bottomsheetroundedcorners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.Toast
import com.example.bottomsheetroundedcorners.databinding.ActivityMainBinding
import com.example.bottomsheetroundedcorners.databinding.LayoutBottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnShowBottomSheet.setOnClickListener {
            val bottomSheetDialog = BottomSheetDialog(
                this@MainActivity,R.style.BottomSheetDialogTheme
            )

           val bindingBottomSheet = LayoutBottomSheetBinding.inflate(layoutInflater)

//            val bottomSheetView = LayoutInflater.from(applicationContext).inflate(
//                R.layout.layout_bottom_sheet,
//                findViewById<LinearLayout>(R.id.design_bottom_sheet)
//            )

            bindingBottomSheet.btnShare.setOnClickListener {
                Toast.makeText(this,"Share...",Toast.LENGTH_LONG).show()
                bottomSheetDialog.dismiss()
            }

            bottomSheetDialog.setContentView(bindingBottomSheet.root)
            bottomSheetDialog.show()
        }

    }
}