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
   var numberList = fibonacci(100)
       val numberAdapter = NumbersRecyclerViewAdapter(numberList)
       binding.rvNUmbers.layoutManager = LinearLayoutManager(this)
       binding.rvNUmbers.adapter=numberAdapter
   }

   fun fibonacci(n:Int):List<Int> {
       var list = ArrayList<Int>()
       var prv = 0
       var prvone = 1
       for (i in 0..n) {
           var sum = prv + prvone
           prv = prvone
           prvone = sum
       }
       return list
   }
}



