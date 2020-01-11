package com.melyseev.basketswoosh

import android.os.Bundle

class SkillActivity : BasicActivity() {

    var league=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league=  intent.getStringExtra(EXTRA_LEAGUE)

        println(league)
    }
}
