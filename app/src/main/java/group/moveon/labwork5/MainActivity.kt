package group.moveon.labwork5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonAddItem: FloatingActionButton = findViewById(R.id.button_add_item)


        buttonAddItem.setOnClickListener {
            val intent = Intent (this, AddActivityItem::class.java)
            startActivityForResult(intent, 1)
            //startActivity(intent)
        }


    }




}