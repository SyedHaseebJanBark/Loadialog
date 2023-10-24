package com.hsb.loadingdialogio

import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import com.hsb.loadialog.databinding.LoadingDialogBinding

class Loadialog(activity: Activity) : Dialog(activity) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = LoadingDialogBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun showDialog() {
        if (!isShowing) {
            show()
        }
    }

    fun dismissDialog() {
        if (isShowing) {
            dismiss()
        }
    }
}