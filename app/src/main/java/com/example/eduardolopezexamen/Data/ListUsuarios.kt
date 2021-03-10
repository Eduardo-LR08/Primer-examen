package com.example.eduardolopezexamen.Data

import android.util.Log
import com.example.eduardolopezexamen.Entity.EntityUsuarios
import com.example.eduardolopezexamen.Tools.Constants

class ListUsuarios {



    fun add(usuarios: EntityUsuarios):Int{
        var answer= -1
        if (!existNameFilter(usuarios.name)){
            listUsarios.add(usuarios)
            answer = listUsarios.size -1

        }
        return answer;
    }

    fun delete(name:String):Boolean{
        var answer:Boolean = false

        for ((index,item) in listUsarios.withIndex()){

            if (item.name == name){
                listUsarios.removeAt(index)
                answer=true;
                break;
            }
        }
            return answer;
    }
    fun edit(name:String, usuarios:EntityUsuarios):Boolean{
        var answer:Boolean = false

        for ((index,item) in listUsarios.withIndex()){

            if (item.name == name){

                listUsarios[index].gender = usuarios.gender
                listUsarios[index].entrega = usuarios.entrega
                answer= true;
                break;

            }
        }
        return answer;
    }

    fun showListStudents(){
        Log.d(Constants.LOG_TAG,"${listUsarios.size}")
        for((index,item) in listUsarios.withIndex()){
            Log.d(Constants.LOG_TAG,"$index ${item.name} ${item.entrega} ${item.gender}")
            //Log.d(Constants.LOG_TAG,"$index ${listStudents[index].name} ${listStudents[index].degree} ${listStudents[index].gender}")
        }
    }

    fun existsName(name:String):Boolean {
        var answer: Boolean = false
        for (element in listUsarios) {
            if (element.name == name) {
                answer = true;
                break;
            }
        }
        return answer;
    }

    fun existNameFilter(name:String):Boolean{
        var answer: Boolean = false
        if (listUsarios.filter { e -> e.name == name }.count()==1)
        {
            answer=true
        }

        return answer
    }
    fun getStringArray():Array<String>{
        val answareList= arrayListOf<String>()
        for((index,item)in listUsarios.withIndex()){
            answareList.add("${item.name} ${item.promociones} " +
                    "${  if (item.gender==1) "Masulino" else if (item.gender==2) "Femenino" else "genero no seleccionado"}  ${item.entrega} ")
        }
        return answareList.toTypedArray()
    }

    fun getEntityStudentArray(): Array<EntityUsuarios> {
        return listUsarios.toTypedArray()
    }
    fun getStudent(index:Int):EntityUsuarios{
        return listUsarios[index]
    }

    companion object{
        private var listUsarios = arrayListOf<EntityUsuarios>()
    }
}