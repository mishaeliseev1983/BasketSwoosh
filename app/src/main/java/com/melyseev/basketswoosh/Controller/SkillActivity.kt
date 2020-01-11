package com.melyseev.basketswoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.melyseev.basketswoosh.Model.Player
import com.melyseev.basketswoosh.R
import com.melyseev.basketswoosh.Utilities.EXTRA_PLAYER

import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BasicActivity() {

    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player=  intent.getParcelableExtra(EXTRA_PLAYER)
    }




    fun onBallerClicked(view: View) {
        btnBeginnerSkill.isChecked= false
        player.skill="baller"
    }


    fun onBeginnerClicked(view: View) {
        btnBallerSkill.isChecked= false
        player.skill= "beginner"
    }


    fun onFinishClicked(view: View) {

        if(player.skill!=""){
            val finishActivity= Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity( finishActivity )
        }else{
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()
        }
    }
}
