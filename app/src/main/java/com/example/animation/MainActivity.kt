package com.example.animation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    private var is_like = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView.setOnClickListener {

            if (is_like == false){

                is_like = true

              val animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.scale)

                animation.setAnimationListener(object:Animation.AnimationListener{
                    override fun onAnimationRepeat(animation: Animation?) {

                    }

                    override fun onAnimationEnd(animation: Animation?) {

                    }

                    override fun onAnimationStart(animation: Animation?) {

                        imageView.setImageResource(R.drawable.thumb_up_fill)

                    }


                })

              imageView.startAnimation(animation)

            }

            else{

                is_like = false

                val animation = AnimationUtils.loadAnimation(this@MainActivity,R.anim.scale)

                animation.setAnimationListener(object:Animation.AnimationListener{
                    override fun onAnimationRepeat(animation: Animation?) {

                    }

                    override fun onAnimationEnd(animation: Animation?) {

                    }

                    override fun onAnimationStart(animation: Animation?) {
                         imageView.setImageResource(R.drawable.thumb_up)

                    }


                })

                imageView.startAnimation(animation)


            }

        }

    }
}
