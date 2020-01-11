package com.melyseev.basketswoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.melyseev.basketswoosh.Model.Player
import com.melyseev.basketswoosh.R
import com.melyseev.basketswoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BasicActivity() {

    var player= Player("", "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClicked(view: View) {

        if(player.league!="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }
    }

    fun onCoedClicked(view: View) {

        btnMensLeague.isChecked= false
        btnWomensLeague.isChecked= false
        player.league= "co-ed"
    }

    fun onWomensClicked(view: View) {

        btnMensLeague.isChecked= false
        btnCoed.isChecked= false
        player.league="womens"
    }

    fun onMensClicked(view: View) {
        btnWomensLeague.isChecked= false
        btnCoed.isChecked= false
        player.league="mens"
    }
}
