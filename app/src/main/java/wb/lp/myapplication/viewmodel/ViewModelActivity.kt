package wb.lp.myapplication.viewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import wb.lp.myapplication.databinding.ActivityViewmodelBinding

class ViewModelActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewmodelBinding

    lateinit var viewModel: MainViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewmodelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this, MainViewModelFactory(10)).get(MainViewModel::class.java)
        binding.plusOneBtn.setOnClickListener {
            viewModel.counter++
            refreshCounter()
        }

        refreshCounter()
    }

    private fun refreshCounter() {
        binding.infoText.text = viewModel.counter.toString()
    }

}


//    lateinit var viewModel: MainViewModel1
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        binding = ActivityViewmodelBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//
//        viewModel = ViewModelProvider(this).get(MainViewModel1::class.java)
//        binding.plusOneBtn.setOnClickListener {
//            viewModel.counter++
//            refreshCounter()
//        }
//
//        refreshCounter()
//    }
//
//    private fun refreshCounter() {
//        binding.infoText.text = viewModel.counter.toString()
//    }
