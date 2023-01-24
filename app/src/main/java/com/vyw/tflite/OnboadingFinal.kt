package com.vyw.tflite

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat
import androidx.core.view.setMargins
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.button.MaterialButton
import com.vyw.tflite.R

class OnboadingFinal : AppCompatActivity() {

    private lateinit var onboardingItemsAdapter: OnboardingItemsAdapter
    private lateinit var indicatorscontainer : LinearLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboading_final)
        setOnboardingItem()

    }
    private fun setOnboardingItem(){
        onboardingItemsAdapter = OnboardingItemsAdapter(
            listOf(
                OnboardingItem(
                    onboardingimage = R.drawable.entry1,
                    title = "",
                    description = ""

                ),
                OnboardingItem(
                    onboardingimage = R.drawable.work1,
                    title = "",
                    description = ""
                ),
                OnboardingItem(
                    onboardingimage = R.drawable.work2,
                    title = "",
                    description = ""
                )
            )
        )
        val onboardingViewPager = findViewById<ViewPager2>(R.id.viewpagerfinal)
        onboardingViewPager.adapter = onboardingItemsAdapter
        findViewById<ImageView>(R.id.imgnext).setOnClickListener {

        }
        findViewById<MaterialButton>(R.id.getstart).setOnClickListener {
            navigatetohomeactivity()
        }
    }
    private fun navigatetohomeactivity(){
        startActivity(Intent(applicationContext, MainActivity:: class.java))
        finish()
    }

}
