MainActivity.kt:

package com.example.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import com.example.paintapp.PaintView.Companion.colorList
import com.example.paintapp.PaintView.Companion.currentBrush
import com.example.paintapp.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object{
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val redBtn = findViewById<ImageButton>(R.id.red)
        val yellowBtn = findViewById<ImageButton>(R.id.yellow)
        val greenBtn = findViewById<ImageButton>(R.id.green)
        val cyanBtn = findViewById<ImageButton>(R.id.cyan)
        val blueBtn = findViewById<ImageButton>(R.id.blue)
        val blackBtn = findViewById<ImageButton>(R.id.black)
        val whiteBtn = findViewById<ImageButton>(R.id.white)

        redBtn.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show()
           paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }
        yellowBtn.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.YELLOW
            currentColor(paintBrush.color)
        }
        greenBtn.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.GREEN
            currentColor(paintBrush.color)
        }

        cyanBtn.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.CYAN
            currentColor(paintBrush.color)
        }

        blueBtn.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }
        blackBtn.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show()
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        whiteBtn.setOnClickListener{
            Toast.makeText(this,"Clicked",Toast.LENGTH_LONG).show()
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }
    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }
}
