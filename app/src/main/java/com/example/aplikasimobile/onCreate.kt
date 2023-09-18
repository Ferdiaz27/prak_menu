import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_item_1 -> {
                // Aksi yang diambil ketika Item 1 dipilih
                return true
            }
            R.id.menu_item_2 -> {
                // Aksi yang diambil ketika Item 2 dipilih
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}
