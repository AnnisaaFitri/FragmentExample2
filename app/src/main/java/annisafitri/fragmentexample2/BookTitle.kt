package annisafitri.fragmentexample2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import annisafitri.fragmentexample2.R
import kotlinx.android.synthetic.main.book_titels.*

class BookTitle: Fragment(), View.OnClickListener {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.book_titels, container, false)
        return v
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        rlas3.setOnClickListener(this)
        rlas3kotlin.setOnClickListener(this)
        rminandroid.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var index:Int = 0
        when(v?.id) {
            R.id.rlas3 -> {
                index = 0

            }
            R.id.rlas3kotlin -> {
                index = 1

            }
            R.id.rminandroid -> {
                index = 2
            }
        }
    }
}