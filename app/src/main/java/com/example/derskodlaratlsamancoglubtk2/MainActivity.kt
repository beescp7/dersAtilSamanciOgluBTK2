 package com.example.derskodlaratlsamancoglubtk2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

 //Sınıflar ve Fonksiyonlar
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       var j=10
        if(j==0)
        {
            ilkFonksiyon()
        }
        else
        {
            ikinciFonksiyon()
        }
         cikarma(50,3)
        var x=toplama(20,33)
        println(x)
        textView.text="Sonuc : ${x}"
        button.setOnClickListener {
            val toplamasonuc=toplama(123,123)
            textView.text="Sonuc : ${toplamasonuc}"
        }
        sinifCalismasi()
        nullGüvenligi()
    }
    fun ilkFonksiyon(){
        println("ilk fonksiyon calıstırıldı")
    }
    fun ikinciFonksiyon(){
        println("ikinci calisti")
    }
    //Girdi Almak
    fun cikarma(x:Int,y:Int){
        textView.text="Sonuc : "+(x-y).toString()
    }
     //cıktı Vermek->Döndürmek Return
     fun toplama(a:Int,b:Int):Int{
         return a+b
     }
     fun degistir(view: View){
        val toplamasonuc=toplama(30,234)
         textView.text="Sonuc : ${toplamasonuc}"
     }
     fun sinifCalismasi(){

         var superman=SuperKahraman(isim = "Superman", yas = 50, meslek = "gazeteci")
         superman.testFonksiyonu()
         println(superman.sacRenginiAl() )
         //superman.sacRengi="yesil"
         textView.text="Yas :${superman.yas} "

     }
     fun nullGüvenligi(){
         //null,nullability,null safety
        //definening
         var tryString:String? //null degeri alabilen
         var benimYasim:Int?=null
         //initialization
         tryString="berkan"
         println(benimYasim)
         //1.yontem Null Safety
         if(benimYasim!=null)
         {
             println(benimYasim*2)
         }
         else
         {
             println("null geldi")
         }

         //2 !! null olmayacak ? null olabilir demek
         println(benimYasim?.minus(2))
         //3 elvis operatoru
        // benimYasim=10
         val sonuc=benimYasim?.minus(2) ?:10
         println(sonuc)
         //let
         benimYasim?.let {
             println(it*5)
         }
     }

}