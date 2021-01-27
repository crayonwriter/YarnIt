package com.crayonwriter.yarnit

import android.content.Context
import android.provider.ContactsContract
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.databinding.DataBindingUtil
import com.crayonwriter.yarnit.databinding.YarnItemBinding

class YarnItem(context: Context?) : LinearLayout(context) {

    private var binding: YarnItemBinding = DataBindingUtil.inflate(LayoutInflater.from(context),
    R.layout.yarn_item, this, false)

fun addViewToList(yarn: YarnDataClass) {
binding.apply {
addView(this.root)
yarnColorText.text = yarn.yarnColorName
    yarnBrandText.text = yarn.yarnCompanyBrand
    yarnWeightText.text = yarn.yarnWeight
    yarnDescriptionText.text = yarn.yarnDescriptionType
}
}


}