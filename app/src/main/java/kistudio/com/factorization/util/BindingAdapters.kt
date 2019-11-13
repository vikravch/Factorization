package kistudio.com.factorization.util

import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import kistudio.com.factorization.view.getParentActivity

@BindingAdapter("mutableText")
fun setMutableText(view: TextView, text: MutableLiveData<String>) {
  val parentActivity: AppCompatActivity? = view.getParentActivity()
  if (parentActivity != null) {
    text.observe(parentActivity, Observer { value -> view.text = value ?: "" })
  }
}

@BindingAdapter("textChangedListener")
fun onTextChanged(et: EditText, textWatcher: TextWatcher) {
  et.addTextChangedListener(textWatcher)
}
