import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.PopupMenu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<View>(R.id.button) // Gantilah dengan ID elemen UI Anda
        button.setOnClickListener { view ->
            showPopupMenu(view)
        }
    }

    private fun showPopupMenu(view: View) {
        val popupMenu = PopupMenu(this, view)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)

        popupMenu.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.popup_item_1 -> {
                    // Aksi yang diambil ketika Popup Item 1 dipilih
                    true
                }
                R.id.popup_item_2 -> {
                    // Aksi yang diambil ketika Popup Item 2 dipilih
                    true
                }
                else -> false
            }
        }

        popupMenu.show()
    }
}
