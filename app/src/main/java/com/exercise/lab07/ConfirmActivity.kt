package com.exercise.lab07

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.exercise.lab07.databinding.ActivityConfirmBinding

class ConfirmActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConfirmBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
     //   enableEdgeToEdge()

        binding = ActivityConfirmBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.nameTextView.text = intent.getStringExtra("name")
        binding.addressTextView.text = intent.getStringExtra("address")
        binding.cityTextView.text = intent.getStringExtra("city")
        binding.postcodeTextView.text = intent.getStringExtra("postcode")
        binding.stateTextView.text = intent.getStringExtra("state")
        binding.countryTextView.text = intent.getStringExtra("country")

        binding.confirmBtn.setOnClickListener {
            val intent = Intent(this, FinishActivity::class.java)
            startActivity(intent)
        }

        binding.cancelBtn.setOnClickListener {
            finish()
        }


        }
    }
