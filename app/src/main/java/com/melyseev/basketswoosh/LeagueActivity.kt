package com.melyseev.basketswoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BasicActivity() {

    var selectedLeague=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {
        if(selectedLeague!="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onCoedClicked(view: View) {

        btnMensLeague.isChecked= false
        btnWomensLeague.isChecked= false
        selectedLeague= "co-ed"
    }

    fun onWomensClicked(view: View) {

        btnMensLeague.isChecked= false
        btnCoed.isChecked= false
        selectedLeague="womens"
    }

    fun onMensClicked(view: View) {
        btnWomensLeague.isChecked= false
        btnCoed.isChecked= false
        selectedLeague="mens"
    }
}
