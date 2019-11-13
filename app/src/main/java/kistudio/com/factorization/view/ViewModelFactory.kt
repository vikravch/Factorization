package kistudio.com.factorization.view

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(private val activity: AppCompatActivity) : ViewModelProvider.Factory {
  override fun <T : ViewModel?> create(modelClass: Class<T>): T {
    if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
      @Suppress("UNCHECKED_CAST")
      return MainActivityViewModel(activity) as T
    }
    throw IllegalArgumentException("Unknown ViewModel class")
  }
}