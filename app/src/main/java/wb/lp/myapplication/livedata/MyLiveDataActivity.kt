package wb.lp.myapplication.livedata

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import wb.lp.myapplication.databinding.ActivityViewmodelBinding

class MyLiveDataActivity : AppCompatActivity() {

    private lateinit var binding: ActivityViewmodelBinding

    lateinit var viewModel: MyViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewmodelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel = ViewModelProvider(this).get(MyViewModel::class.java)
        binding.infoText.text = viewModel.counter.value.toString()

        binding.plusOneBtn.setOnClickListener {
            viewModel.plusOne()
        }

        //Activity本身就是一个LifecycleOwner对象，因此直接传this
        viewModel.counter.observe(this, Observer { count ->
            Log.d("MyLiveDataActivity", "viewModel.counter.observe")
            binding.infoText.text = count.toString()
        })
    }

}
