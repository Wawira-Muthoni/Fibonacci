package dev.christine.fibonaccanums

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.christine.fibonaccanums.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayNumbers()

    }
   fun displayNumbers(){
//       val n = 100
//        var t1 = 0
//        var t2 = 1
//
//        print("First $n terms: ")
//
//        for (i in 1..n) {
//            print("$t1 + ")
//
//            val sum = t1 + t2
//            t1 = t2
//            t2 = sum
//        }


    var numberList = listOf<Int>( 0, 1, 1 ,2 ,3 ,5 ,8 ,13 ,21 ,34, 55 ,89 ,144 ,233 ,377 ,610 ,987,
        1597 ,2584, 4181 ,6765 ,10946 ,17711 ,28657 ,46368 ,75025 ,121393 ,196418, 317811 ,514229 ,
        832040 , 1346269 ,2178309 ,3524578 ,5702887 ,9227465 ,14930352 ,24157817 ,
        39088169 ,63245986 ,102334155 ,165580141 ,267914296 ,433494437 ,701408733 ,1134903170 )
    val numberAdapter =NumbersRecyclerViewAdapter(numberList)

    binding.rvNUmbers.layoutManager = LinearLayoutManager(this)
     binding.rvNUmbers.adapter = numberAdapter

}
}



