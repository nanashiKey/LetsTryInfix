package com.ngopidev.project.letstryinfix

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculate.setOnClickListener{
            val get1numb = et_number.text.toString()
            val get2numb = et_number2.text.toString()

            if(get1numb.isNotEmpty() && get2numb.isNotEmpty()){
                val hasilTambah = get1numb.toInt() aduhTambah get2numb.toInt()
                hasil.visibility = View.VISIBLE

                hasil.text = "hasil tambahnya adalah : \n$hasilTambah"
            }else{
                "Error Boss isi semua kolom dulu dah" messageToast this@MainActivity
            }

        }

        pindahHalaman.setOnClickListener {
            this@MainActivity pindahKe KuyActivity::class.java
        }

        pindahHalamanSpesifik.setOnClickListener {
            this@MainActivity spesifikKe Main2Activity::class.java
        }
    }


    //sample infix untuk pertambahan
    infix fun Int.aduhTambah(tambahin : Int) : Int = this+tambahin

    //sample infix untuk menghasilkan sebuah toast
    infix fun String.messageToast(ctx : Context){
        Toast.makeText(ctx, this , Toast.LENGTH_SHORT).show()
    }

    //sample infix untuk menggunakan intent ke class apapun
    infix fun <T : Any> Context.pindahKe(pindahKelas : Class<T>){
        startActivity(Intent(this, pindahKelas))
    }

    //sample infix untuk menggunakan intent ke class spesifik dalam hal ini Main2Activity
    infix fun Context.spesifikKe(pindahKelas :Class<Main2Activity>){
        startActivity(Intent(this, pindahKelas))
    }

}
