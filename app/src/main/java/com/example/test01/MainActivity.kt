package com.example.test01

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonTopla.setOnClickListener{
            var ad=txtSayi1.getText();
            var sayi1:Int=ad.toString().toInt()
            var ad2=txtSayi2.getText();
            var sayi2:Int=ad2.toString().toInt()
            var sonuc:Int=sayi1+sayi2
            textView58.text="Toplama Sonucu : " + sonuc
        }

        buttonCikar.setOnClickListener {
            var giris1 = txtSayi1.getText()
            var sayi1 : Int = giris1.toString().toInt()
            var giris2 = txtSayi2.getText()
            var sayi2 : Int = giris2.toString().toInt()
            var sonuc : Int = sayi1 - sayi2
            textView58.text = "Çıkarma Sonucu : " + sonuc
        }

        buttonCarp.setOnClickListener {
            var giris1 = txtSayi1.getText()
            var sayi1 : Int = giris1.toString().toInt()
            var giris2 = txtSayi2.getText()
            var sayi2 : Int = giris2.toString().toInt()
            var sonuc : Int = sayi1 * sayi2
            textView58.text = "Çarpma Sonucu : " + sonuc
        }

        buttonBol.setOnClickListener {
            var giris1 = txtSayi1.getText()
            var sayi1 : Int = giris1.toString().toInt()
            var giris2 = txtSayi2.getText()
            var sayi2 : Int = giris2.toString().toInt()
            var sonuc : Int = sayi1 / sayi2
            textView58.text = "Bölme Sonucu : " + sonuc
        }

    }
}
