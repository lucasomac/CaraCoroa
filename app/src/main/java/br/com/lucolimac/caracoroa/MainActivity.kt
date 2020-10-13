package br.com.lucolimac.caracoroa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        caracoroa.setImageResource(R.drawable.cara_coroa)
        jogar.setOnClickListener(View.OnClickListener {
            val randomInteger = (0..1).shuffled().first()
            when {
                randomInteger == 1 -> {
                    caracoroa.setImageResource(R.drawable.cara_real)
                    resultado.setText("CARA")
                }
                randomInteger == 0 -> {
                    caracoroa.setImageResource(R.drawable.coroa_real)
                    resultado.setText("CORÔA")
                }
            }
        })
        resetar.setOnClickListener(View.OnClickListener {
            caracoroa.setImageResource(R.drawable.cara_coroa)
        })
    }
}