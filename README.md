# LetsTryInfix
this branch describe about how to use infix function in kotlin 

# what is infix?
infix merupakan salah satu spesial method yang disediakan pada bahasa pemrograman kotlin

cara pembuatan method infix cukup mudah hanya buat seperti berikut :

infix fun TipeObject.namaMethod(parameternyaApa){<br/>
    //do something here<br/>
}<br/>

jika memerlukan nilai balik maka akan seperti berikut :

infix fun TipeObject.namaMethod(parameternyaApa) : NilaiBaliknyaApa{<br/>
  //do somethin here<br/>
  jangan lupa di return<br/>
}

dan saat penggunaannya hanya seperti berikut ini :
 
 <b>TipeObject namaMethod parameternyaApa</b><br/>

contoh yang ada pada branch ini adalah : <br/>
* method infix untuk memunculkan toast
* method infix untuk intent
* method infix untuk melakukan penambahan
