package com.example.eduardolopezexamen.Entity

data class EntityUsuarios(
    var name:String,
    var promociones:String,
    var gender:Int,
    var entrega:String,
    var postres:Boolean,
    var bebidas:Boolean,
    var saludable:Boolean,
    var pagoTarjeta:Boolean){
    constructor():this("","",0,"",false,false,false,false)
}