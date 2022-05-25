package annisafitri.fragmentexample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    lateinit var fragBookDescription: BookDescriptions
    lateinit var fragBookTitle: BookTitle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragBookTitle = BookTitle()
        fragBookDescription = BookDescriptions()
        val fragTransaction = supportFragmentManager.beginTransaction()
        fragTransaction.add(R.id.fragtop, fragBookTitle)
        fragTransaction.add(R.id.fragbottom, fragBookDescription)
        fragTransaction.commit()
    }

    fun onBookChanged(index:Int) {
        fragBookDescription.changeDescription(index)

    }
}