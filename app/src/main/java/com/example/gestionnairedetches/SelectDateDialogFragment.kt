package com.example.gestionnairedetches

import android.app.AlertDialog
import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class SelectDateDialogFragment: DialogFragment() {
    interface SelectDateListener {


        fun onDialogPositiveClick()
    }
    var  listener: SelectDateListener? =null



    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder=AlertDialog.Builder(activity)

        val inflater= activity?.layoutInflater

         builder.setView(inflater?.inflate(R.layout.dialog_select_date,null))
                 .setPositiveButton("ok", DialogInterface.OnClickListener { dialog, id -> listener?.onDialogPositiveClick() })

                 .setTitle("selectionner une date")
        return builder.create()


    }
}