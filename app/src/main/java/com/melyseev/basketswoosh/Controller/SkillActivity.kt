package com.melyseev.basketswoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.melyseev.basketswoosh.Utilities.EXTRA_LEAGUE
import com.melyseev.basketswoosh.R
import com.melyseev.basketswoosh.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BasicActivity() {

    var league=""
    var skill=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league=  intent.getStringExtra(EXTRA_LEAGUE)
    }




    fun onBallerClicked(view: View) {
        btnBeginnerSkill.isChecked= false
        skill= "baller"
    }


    fun onBeginnerClicked(view: View) {
        btnBallerSkill.isChecked= false
        skill= "beginner"
    }


    fun onFinishClicked(view: View) {

        if(skill!=""){
            val finishActivity= Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity( finishActivity )
        }else{
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
