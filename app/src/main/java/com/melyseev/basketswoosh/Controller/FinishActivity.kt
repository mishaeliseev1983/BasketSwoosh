package com.melyseev.basketswoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.melyseev.basketswoosh.Model.Player
import com.melyseev.basketswoosh.R
import com.melyseev.basketswoosh.Utilities.EXTRA_PLAYER

import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player=intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        tvSearchLeagueText.text= "Looking for ${player.league} ${player.skill} league near you ..."
    }
}
