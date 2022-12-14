package com.example.derskodlaratlsamancoglubtk2
//primary constructor
class SuperKahraman(var isim:String,var yas:Int,var meslek:String) {
private var sacRengi="Sari"
    //getter
    fun sacRenginiAl():String{
        return this.sacRengi
    }
    //setter
    fun sacRenginiDegistir(renk:String){
        this.sacRengi=renk
    }
 fun testFonksiyonu()
 {
     println("test")
 }
    //Access Levels -Erişebilirlik Seviyeleri
    //private -protected- internal-public


   /* //Property
    var isim=""
    var yas=0
    var meslek=""
    //Constructor
    constructor(isim:String,yas:Int,meslek:String){
       this.meslek=meslek
        this.yas=yas
        this.isim=isim
        println("constructor cagirildi")
    }*/

}