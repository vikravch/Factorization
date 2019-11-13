package kistudio.com.factorization.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import kistudio.com.factorization.R
import kistudio.com.factorization.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

  private lateinit var binding: ActivityMainBinding
  private lateinit var mViewModel: MainActivityViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = DataBindingUtil.setContentView(
        this,
        R.layout.activity_main
    )
    mViewModel = ViewModelProviders.of(
        this,
        ViewModelFactory(this)
    )
        .get(MainActivityViewModel::class.java)
    binding.viewModel = mViewModel
  }
}