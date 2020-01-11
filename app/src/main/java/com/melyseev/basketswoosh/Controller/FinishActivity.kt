package com.melyseev.basketswoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.melyseev.basketswoosh.R
import com.melyseev.basketswoosh.Utilities.EXTRA_LEAGUE
import com.melyseev.basketswoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league=intent.getStringExtra(EXTRA_LEAGUE)
        val skill= intent.getStringExtra(EXTRA_SKILL)

        tvSearchLeagueText.text= "Looking for $league $skill league near you ..."

    }
}
