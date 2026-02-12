package wb.lp.myapplication.livedata

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel() : ViewModel() {

    val counter = MutableLiveData<Int>(0)

    fun plusOne() {
        val count = counter.value ?: 0
        counter.value = count + 1
    }

}
