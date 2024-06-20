package com.akirachix.fibonnacciseries

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.fibonnacciseries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fibonacciGenerator = FibonacciGenerator()
        val numberList = fibonacciGenerator.generateFibonacciSequence(100)

        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        val fibonacciAdapter = NumbersRecyclerViewsAdapter(numberList)
        binding.rvNumbers.adapter = fibonacciAdapter
    }

    class FibonacciGenerator {
        fun generateFibonacciSequence(n: Int): List<Int> {
            val fibSequence = mutableListOf(0, 1)
            var a = 0
            var b = 1
            while (fibSequence.size < n) {
                val sum = a + b
                if (sum < 0) {
                    break
                }
                fibSequence.add(sum)
                a = b
                b = sum
            }
            return fibSequence
        }
    }
}






