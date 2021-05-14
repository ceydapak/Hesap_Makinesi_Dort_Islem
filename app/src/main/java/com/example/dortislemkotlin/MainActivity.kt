package com.example.dortislemkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun topla (view: View) {
        var x = editText1.text.toString().toDoubleOrNull()
        var y= editText2.text.toString().toDoubleOrNull()

        if(x==null || y==null){
            textView.text="Geçersiz girdi"
        }
        else{
           var sonuc= x + y
            textView.text= "Sonuç: ${sonuc}"
        }
    }
    fun cikar (view: View) {
        var x = editText1.text.toString().toDoubleOrNull()
        var y= editText2.text.toString().toDoubleOrNull()

        if(x==null || y==null){
            textView.text="Geçersiz girdi"
        }
        else{
            var sonuc= x - y
            textView.text= "Sonuç: ${sonuc}"
        }
    }
    fun carp (view: View) {
        var x = editText1.text.toString().toDoubleOrNull()
        var y= editText2.text.toString().toDoubleOrNull()
        if(x==null || y==null){
            textView.text="Geçersiz girdi"
        }
        else{
            var sonuc= x * y
            textView.text= "Sonuç: ${sonuc}"
        }
    }
    fun bol (view: View) {
        var x = editText1.text.toString().toDoubleOrNull()
        var y= editText2.text.toString().toDoubleOrNull()

        if(x==null || y==null){
            textView.text="Geçersiz girdi"
        }
        else{
            var sonuc= x / y
            textView.text= "Sonuç: ${sonuc}"
        }
    }
}