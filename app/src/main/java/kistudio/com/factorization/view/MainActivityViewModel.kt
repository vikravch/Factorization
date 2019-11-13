package kistudio.com.factorization.view

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kistudio.com.factorization.util.Factorization
import kotlinx.android.synthetic.main.activity_main.*

class MainActivityViewModel(private val activity: AppCompatActivity) : ViewModel() {

  val res: MutableLiveData<String> = MutableLiveData()

  fun onClickCalculate() {
    try {
      res.value =
          Factorization.primeFactors(activity.etIncome.text.toString().toInt())
              .joinToString()
    } catch (ex: NumberFormatException) {
      res.value = "Wrong number! Please enter another one."
    }
  }
}